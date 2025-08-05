package com.example.bondjio.ui.navigation

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.example.bondjio.R
import com.example.bondjio.ui.theme.blue
import com.example.bondjio.ui.theme.dark_gray

@Composable
fun BottomNavBar(navController: NavController) {
    // Get the current route to determine which icon should be selected
    val currentRoute = navController.currentDestination?.route
    val selectedColor = blue
    val unselectedColor = dark_gray

    NavigationBar {
        // Home Icon
        NavigationBarItem(
            icon = {
                Icon(
                    painterResource(R.drawable.ic_home),
                    contentDescription = stringResource(R.string.home),
                    tint = if (currentRoute == null || currentRoute == Routes.Home.route) selectedColor else unselectedColor
                )
            },
            selected = navController.currentDestination?.route == stringResource(R.string.home),
            onClick = { navController.navigate(Routes.Home.route) }
        )

        // Search Icon
        NavigationBarItem(
            icon = {
                Icon(
                    painterResource(R.drawable.ic_search),
                    contentDescription = stringResource(R.string.search),
                    tint = if (currentRoute == Routes.Search.route) selectedColor else unselectedColor
                )
            },
            selected = navController.currentDestination?.route == stringResource(R.string.search),
            onClick = { navController.navigate(Routes.Search.route) }
        )

        // Tickets Icon
        NavigationBarItem(
            icon = {
                Icon(
                    painterResource(R.drawable.ic_tickets),
                    contentDescription = stringResource(R.string.tickets),
                    tint = if (currentRoute == Routes.Tickets.route) selectedColor else unselectedColor
                )
            },
            selected = navController.currentDestination?.route == stringResource(R.string.tickets),
            onClick = { navController.navigate(Routes.Tickets.route) }
        )

        // Community Icon
        NavigationBarItem(
            icon = {
                Icon(
                    painterResource(R.drawable.ic_community),
                    contentDescription = stringResource(R.string.community),
                    tint = if (currentRoute == Routes.Community.route) selectedColor else unselectedColor
                )
            },
            selected = navController.currentDestination?.route == stringResource(R.string.community),
            onClick = { navController.navigate(Routes.Community.route) }
        )

        // Account Icon
        NavigationBarItem(
            icon = {
                Icon(
                    painterResource(R.drawable.ic_account),
                    contentDescription = stringResource(R.string.account),
                    tint = if (currentRoute == Routes.Account.route) selectedColor else unselectedColor
                ) },
            selected = navController.currentDestination?.route == stringResource(R.string.account),
            onClick = { navController.navigate(Routes.Account.route) }
        )
    }
}