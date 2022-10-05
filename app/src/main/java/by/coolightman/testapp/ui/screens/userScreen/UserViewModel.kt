package by.coolightman.testapp.ui.screens.userScreen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import by.coolightman.testapp.domain.usecase.GetPostsByUserUseCase
import by.coolightman.testapp.domain.usecase.GetUserUseCase
import by.coolightman.testapp.util.ARG_USER_ID
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val getUserUseCase: GetUserUseCase,
    private val getPostsByUserUseCase: GetPostsByUserUseCase
) : ViewModel() {

    var uiState by mutableStateOf(UserUiState())
        private set

    init {
        val userId = savedStateHandle.get<Long>(ARG_USER_ID)
        userId?.let {
            getUser(it)
            getPosts(it)
        }
    }

    private fun getUser(userId: Long) {
        uiState = uiState.copy(
            userId = userId
        )
    }

    private fun getPosts(userId: Long) {

    }

}