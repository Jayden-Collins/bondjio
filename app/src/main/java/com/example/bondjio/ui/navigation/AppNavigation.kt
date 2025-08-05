package com.example.bondjio.ui.navigation

//Root NavHost + routes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bondjio.ui.screens.Home
import com.example.bondjio.ui.screens.Search

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
            Scaffold(
                topBar = { TopAppBar(title = { Text("My Tickets") }) },
                bottomBar = { BottomNavBar(navController) },
                content = { padding ->
                    Column(modifier = Modifier.padding(padding)) {
                        Text("My Tickets")
                    }
                }
            )
        }

        composable(Routes.Community.route) {
            Scaffold(
                topBar = { TopAppBar(title = { Text("Community") }) },
                bottomBar = { BottomNavBar(navController) },
                content = { padding ->
                    Column(modifier = Modifier.padding(padding)) {
                        Text("Community")
                    }
                }
            )
        }

        composable(Routes.Account.route) {
            Scaffold(
                topBar = { TopAppBar(title = { Text("Account") }) },
                bottomBar = { BottomNavBar(navController) },
                content = { padding ->
                    Column(modifier = Modifier.padding(padding)) {
                        Text("Account")
                    }
                }
            )
        }
    }
}
