package by.coolightman.testapp.data.repository

import by.coolightman.testapp.data.local.ApiService
import by.coolightman.testapp.domain.model.Post
import by.coolightman.testapp.domain.repository.PostRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class PostRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : PostRepository {

    override fun getPostsByUser(userId: Long): Flow<List<Post>> = flow {

    }

    override fun getPostsCountByUser(userId: Long): Flow<Int> = flow {

    }
}