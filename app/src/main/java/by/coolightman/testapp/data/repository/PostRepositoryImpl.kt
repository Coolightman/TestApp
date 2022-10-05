package by.coolightman.testapp.data.repository

import by.coolightman.testapp.domain.model.Post
import by.coolightman.testapp.domain.repository.PostRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class PostRepositoryImpl @Inject constructor(

): PostRepository {
    override fun getPostsByUser(userId: Long): Flow<List<Post>> {
        TODO("Not yet implemented")
    }

    override fun getPostsCountByUser(userId: Long): Flow<Int> {
        TODO("Not yet implemented")
    }
}