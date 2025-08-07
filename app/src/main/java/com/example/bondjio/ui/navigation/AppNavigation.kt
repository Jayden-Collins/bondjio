package com.example.bondjio.ui.navigation

//Root NavHost + routes

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bondjio.ui.screens.Home
import com.example.bondjio.ui.screens.Login
import com.example.bondjio.ui.screens.Search
import com.example.bondjio.ui.screens.Tickets
import com.example.bondjio.ui.screens.Community

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController,
        startDestination = Routes.Home.route) {

        composable(Routes.Home.route) {
            Home(navController)
        }

        composable(Routes.Search.route) {
            Search(navController)
        }

        composable(Routes.Tickets.route) {
            Tickets(navController)
        }

        composable(Routes.Community.route) {
            Community(navController)
        }

        composable(Routes.Account.route) {
            Login(navController)
        }
    }
}
