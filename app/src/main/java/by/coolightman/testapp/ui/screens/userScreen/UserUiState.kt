package by.coolightman.testapp.ui.screens.userScreen

import by.coolightman.testapp.domain.model.Post

data class UserUiState(
    val userId: Long = 0,
    val imageUrl: String ="",
    val posts: List<Post> = emptyList()
)
