package com.example.bondjio.ui.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.bondjio.R
import com.example.bondjio.ui.theme.blue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar() {
    val onLikesClick = { /* Handle likes click */ }
    val onNotificationsClick = { /* Handle notifications click */ }
    val onMsgClick = { /* Handle messages click */ }

    val color = blue

    TopAppBar(
        title = {
            Row(
                modifier = Modifier
                    .padding(start = 4.dp, end = 8.dp, bottom = 8.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                // Logo aligned to the left
                Image(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = "App Logo",
                    modifier = Modifier
                        .fillMaxHeight()
                )

                // Icons aligned to the right
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    IconButton(onClick = onLikesClick) {
                        Icon(
                            painter = painterResource(R.drawable.ic_likes),
                            contentDescription = "Your Likes",
                            tint = color
                        )
                    }
                    IconButton(onClick = onNotificationsClick) {
                        Icon(
                            painter = painterResource(R.drawable.ic_notifs),
                            contentDescription = "Notifications",
                            tint = color
                        )
                    }
                    IconButton(onClick = onMsgClick) {
                        Icon(
                            painter = painterResource(R.drawable.ic_home_msg),
                            contentDescription = "Chat Messages",
                            tint = color
                        )
                    }
                }
            }
        }
    )
}
