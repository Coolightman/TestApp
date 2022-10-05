package by.coolightman.testapp.data.mappers

import by.coolightman.testapp.data.local.dbModel.PostDb
import by.coolightman.testapp.data.remote.dto.PostDto
import by.coolightman.testapp.domain.model.Post

fun PostDto.toPostDb(): PostDb = PostDb(
    id = id ?: 0L,
    title = title ?: "",
    body = body ?: "",
    userId = userId ?: 0L
)

fun PostDb.toPost(): Post = Post(
    id = id,
    title = title,
    body = body
)