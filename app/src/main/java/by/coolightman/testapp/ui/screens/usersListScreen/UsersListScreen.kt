package by.coolightman.testapp.ui.screens.usersListScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import by.coolightman.testapp.ui.component.UserItem
import by.coolightman.testapp.ui.model.NavRoutes

@Composable
fun UsersListScreen(
    navController: NavHostController,
    viewModel: UsersListViewModel = hiltViewModel()
) {
    val uiState = viewModel.uiState
    val listState = rememberLazyListState()

    Box(modifier = Modifier.fillMaxSize()) {
        LazyColumn(
            state = listState,
            verticalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(12.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            items(
                items = uiState.list,
                key = { it.id }
            ) { user ->
                UserItem(
                    user = user,
                    onClick = {
                        navController.navigate(NavRoutes.User.withArgs(user.id.toString())){
                            launchSingleTop = true
                        }
                    }
                )
            }
        }
    }
}