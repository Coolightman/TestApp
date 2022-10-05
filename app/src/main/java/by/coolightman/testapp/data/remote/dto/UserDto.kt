package by.coolightman.testapp.data.remote.dto

import com.squareup.moshi.Json

data class UserDto(
    @Json(name = "albumId") var albumId: Long? = null,
    @Json(name = "userId") var userId: Long? = null,
    @Json(name = "name") var name: String? = null,
    @Json(name = "url") var url: String? = null,
    @Json(name = "thumbnailUrl") var thumbnailUrl: String? = null
)
