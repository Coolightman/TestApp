package by.coolightman.testapp.domain.usecase

import by.coolightman.testapp.domain.repository.PostRepository
import by.coolightman.testapp.domain.repository.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class GetUsersUseCase @Inject constructor(
    private val userRepository: UserRepository,
    private val postRepository: PostRepository
) {
    operator fun invoke() = flow {
        emit(emptyList())
        val list = userRepository.getUsers().first()
        val postsCounts = list.map { it.id }.map { userId ->
            postRepository.getPostsCountByUser(userId).first()
        }
        val users = list.zip(postsCounts) { user, count -> user.copy(postsCount = count) }
        emit(users)
    }.flowOn(Dispatchers.IO)
}