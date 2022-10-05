package by.coolightman.testapp.data.repository

import by.coolightman.testapp.data.local.ApiService
import by.coolightman.testapp.domain.model.User
import by.coolightman.testapp.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : UserRepository {

    override fun getUsers(): Flow<List<User>> = flow {
        fetchUsers()
        fetchPosts()
    }

    private suspend fun fetchPosts() {
        val response = apiService.getPosts()
        if (response.isSuccessful){

        }
    }

    private suspend fun fetchUsers() {
        val response = apiService.getUsers()
        if (response.isSuccessful){

        }
    }

    override fun getUser(userId: Long): Flow<User> = flow {

    }
}