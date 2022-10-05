package by.coolightman.testapp.domain.usecase

import by.coolightman.testapp.domain.repository.UserRepository
import javax.inject.Inject

class GetUsersUseCase @Inject constructor(
    private val repository: UserRepository
) {
    operator fun invoke() = repository.getUsers()
}