package by.coolightman.testapp.domain.usecase

import by.coolightman.testapp.domain.repository.UserRepository
import javax.inject.Inject

class GetUserUseCase @Inject constructor(
    private val repository: UserRepository
) {
    operator fun invoke(userId: Long) = repository.getUser(userId)
}