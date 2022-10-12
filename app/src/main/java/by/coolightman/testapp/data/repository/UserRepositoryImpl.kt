package by.coolightman.testapp.data.repository

import by.coolightman.testapp.data.local.dao.UserDao
import by.coolightman.testapp.data.mappers.toUser
import by.coolightman.testapp.data.mappers.toUserDb
import by.coolightman.testapp.data.remote.service.ApiService
import by.coolightman.testapp.domain.model.ResultOf
import by.coolightman.testapp.domain.model.User
import by.coolightman.testapp.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val apiService: ApiService,
    private val userDao: UserDao
) : UserRepository {

    override fun getUsers(): Flow<List<User>> =
        userDao.getUsersWithPosts().map {
            it.map { userWithPostsDb ->
                userWithPostsDb.userDb.toUser().copy(
                    postsCount = userWithPostsDb.postsDb.size
                )
            }
        }

    override fun getUser(userId: Long): Flow<User> =
        userDao.getUser(userId).map { it.toUser() }

    override suspend fun fetchUsers(): ResultOf<Unit> {
        return try {
            val response = apiService.getUsers()
            if (response.isSuccessful) {
                response.body()?.let {
                    userDao.insert(it.map { userDto -> userDto.toUserDb() })
                }
                ResultOf.Success(Unit)
            } else {
                ResultOf.Error(
                    response.errorBody()?.toString() ?: "Something wrong with fetch Users"
                )
            }
        } catch (e: Exception) {
            ResultOf.Error("Check INTERNET connection")
        }
    }
}

