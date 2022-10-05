package by.coolightman.testapp.data.repository

import by.coolightman.testapp.data.local.dao.PostDao
import by.coolightman.testapp.data.mappers.toPost
import by.coolightman.testapp.domain.model.Post
import by.coolightman.testapp.domain.repository.PostRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class PostRepositoryImpl @Inject constructor(
    private val postDao: PostDao
) : PostRepository {

    override fun getPostsByUser(userId: Long): Flow<List<Post>> =
        postDao.getAllByUser(userId).map { it.map { postDb -> postDb.toPost() } }

    override fun getPostsCountByUser(userId: Long): Flow<Int> =
        postDao.getPostsCountByUser(userId)
}