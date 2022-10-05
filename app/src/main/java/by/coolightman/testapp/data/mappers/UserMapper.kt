package by.coolightman.testapp.data.mappers

import by.coolightman.testapp.data.local.dbModel.UserDb
import by.coolightman.testapp.data.remote.dto.UserDto
import by.coolightman.testapp.domain.model.User

fun UserDto.toUserDb(): UserDb = UserDb(
    id = userId ?: 0L,
    name = name ?: "",
    imageUrl = url ?: "",
    thumbnailUrl = thumbnailUrl ?: ""
)

fun UserDb.toUser(): User = User(
    id = id,
    name = name,
    imageUrl = imageUrl,
    thumbnailUrl = thumbnailUrl,
    postsCount = 0
)