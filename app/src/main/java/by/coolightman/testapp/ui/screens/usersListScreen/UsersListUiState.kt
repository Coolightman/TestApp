package by.coolightman.testapp.ui.screens.usersListScreen

import by.coolightman.testapp.domain.model.User

data class UsersListUiState(
    val list: List<User> = emptyList()
)