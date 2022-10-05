package by.coolightman.testapp.data.local.dto

import com.squareup.moshi.Json

data class UserDto(
    @Json(name = "albumId") var albumId: Int? = null,
    @Json(name = "userId") var userId: Int? = null,
    @Json(name = "name") var name: String? = null,
    @Json(name = "url") var url: String? = null,
    @Json(name = "thumbnailUrl") var thumbnailUrl: String? = null
)
