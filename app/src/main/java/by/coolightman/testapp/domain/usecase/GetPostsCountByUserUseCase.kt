package by.coolightman.testapp.domain.usecase

import by.coolightman.testapp.domain.repository.PostRepository
import javax.inject.Inject

class GetPostsCountByUserUseCase @Inject constructor(
    private val repository: PostRepository
) {
    operator fun invoke(userId: Long) = repository.getPostsCountByUser(userId)
}