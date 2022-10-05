package by.coolightman.testapp.ui.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import by.coolightman.testapp.R
import by.coolightman.testapp.domain.model.User
import coil.compose.AsyncImage
import coil.request.ImageRequest

@Composable
fun UserItem(
    user: User,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        elevation = 2.dp
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(user.thumbnailUrl)
                    .crossfade(true)
                    .build(),
                contentDescription = "user thumbnail",
                placeholder = painterResource(id = R.drawable.ic_placeholder_24),
                contentScale = ContentScale.Crop,
                modifier = Modifier.clip(CircleShape)
            )
            Column {
                Text(text = user.name)
                Text(text = user.postsCount.toString())
            }
            Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = null)
        }
    }
}