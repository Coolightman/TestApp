package by.coolightman.testapp.domain.usecase

import by.coolightman.testapp.domain.repository.PostRepository
import by.coolightman.testapp.domain.repository.UserRepository
import javax.inject.Inject

class GetUsersUseCase @Inject constructor(
    private val userRepository: UserRepository,
    private val postRepository: PostRepository
) {
    operator fun invoke() = userRepository.getUsers()
}