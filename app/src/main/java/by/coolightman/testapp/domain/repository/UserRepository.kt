package by.coolightman.testapp.domain.repository

import by.coolightman.testapp.domain.model.User
import kotlinx.coroutines.flow.Flow

interface UserRepository {

    fun getUsers(): Flow<List<User>>

    fun getUser(userId: Long): Flow<User>
}