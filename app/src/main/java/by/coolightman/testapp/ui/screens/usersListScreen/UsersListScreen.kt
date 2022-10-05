package by.coolightman.testapp.ui.screens.usersListScreen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import by.coolightman.testapp.ui.model.NavRoutes

@Composable
fun UsersListScreen(
    navController: NavHostController,
    viewModel: UsersListViewModel = hiltViewModel()
) {
    val uiState = viewModel.uiState

    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "UsersList",
            modifier = Modifier.clickable {
                navController.navigate(NavRoutes.User.withArgs("24"))
            }
        )
    }
}