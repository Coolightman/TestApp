package by.coolightman.testapp.domain.repository

import by.coolightman.testapp.domain.model.Post
import kotlinx.coroutines.flow.Flow

interface PostRepository {

    fun getPostsByUser(userId: Long): Flow<List<Post>>

    fun getPostsCountByUser(userId: Long): Flow<Int>
}