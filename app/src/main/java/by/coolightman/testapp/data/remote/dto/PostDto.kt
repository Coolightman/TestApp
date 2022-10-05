package by.coolightman.testapp.data.remote.dto

import com.squareup.moshi.Json

data class PostDto(
    @Json(name = "userId") var userId: Long? = null,
    @Json(name = "id") var id: Long? = null,
    @Json(name = "title") var title: String? = null,
    @Json(name = "body") var body: String? = null
)
