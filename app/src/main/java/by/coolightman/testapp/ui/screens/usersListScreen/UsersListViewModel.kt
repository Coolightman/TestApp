package by.coolightman.testapp.ui.screens.usersListScreen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import by.coolightman.testapp.domain.usecase.GetPostsCountByUserUseCase
import by.coolightman.testapp.domain.usecase.GetUsersUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UsersListViewModel @Inject constructor(
    private val getUsersUseCase: GetUsersUseCase,
    private val getPostsCountByUserUseCase: GetPostsCountByUserUseCase
) : ViewModel() {

    var uiState by mutableStateOf(UsersListUiState())
        private set

    init {
        getUsers()
    }

    private fun getUsers() {

    }
}