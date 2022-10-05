package by.coolightman.testapp.data.repository

import by.coolightman.testapp.data.local.dao.PostDao
import by.coolightman.testapp.data.local.dao.UserDao
import by.coolightman.testapp.data.mappers.toPostDb
import by.coolightman.testapp.data.mappers.toUser
import by.coolightman.testapp.data.mappers.toUserDb
import by.coolightman.testapp.data.remote.ApiService
import by.coolightman.testapp.domain.model.User
import by.coolightman.testapp.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val apiService: ApiService,
    private val userDao: UserDao,
    private val postDao: PostDao
) : UserRepository {

    override fun getUsers(): Flow<List<User>> = flow {
        fetchUsers()
        fetchPosts()
        emit(userDao.getAll().map { it.map { userDb -> userDb.toUser() } }.first())
    }

    private suspend fun fetchUsers() {
        val response = apiService.getUsers()
        if (response.isSuccessful) {
            response.body()?.let {
                userDao.insert(it.map { userDto -> userDto.toUserDb() })
            }
        }
    }

    private suspend fun fetchPosts() {
        val response = apiService.getPosts()
        if (response.isSuccessful) {
            response.body()?.let { it ->
                postDao.insert(it.map { postDto -> postDto.toPostDb() })
            }
        }
    }

    override fun getUser(userId: Long): Flow<User> =
        userDao.getUser(userId).map { it.toUser() }
}