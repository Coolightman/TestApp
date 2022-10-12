package by.coolightman.testapp.domain.usecase

import by.coolightman.testapp.domain.model.User
import by.coolightman.testapp.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetUsersUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    operator fun invoke(): Flow<List<User>> = userRepository.getUsers()
}