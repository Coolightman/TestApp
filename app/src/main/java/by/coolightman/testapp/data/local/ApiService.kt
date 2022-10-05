package by.coolightman.testapp.data.local

import by.coolightman.testapp.data.local.dto.PostDto
import by.coolightman.testapp.data.local.dto.UserDto
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("posts")
    suspend fun getPosts(): Response<List<PostDto>>

    @GET("users")
    suspend fun getUsers(): Response<List<UserDto>>
}