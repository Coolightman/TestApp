package by.coolightman.testapp.data.repository

import by.coolightman.testapp.domain.model.User
import by.coolightman.testapp.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(

): UserRepository {
    override fun getUsers(): Flow<List<User>> {
        TODO("Not yet implemented")
    }

    override fun getUser(userId: Long): Flow<User> {
        TODO("Not yet implemented")
    }
}