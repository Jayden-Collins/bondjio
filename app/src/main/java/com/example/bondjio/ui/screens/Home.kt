package com.example.bondjio.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.bondjio.ui.navigation.BottomNavBar
import com.example.bondjio.ui.navigation.Routes
import com.example.bondjio.ui.navigation.TopBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(navController: NavController) {
    Scaffold(
        topBar = { TopBar() },
        bottomBar = { BottomNavBar(navController) },
        content = { padding ->
            Column(modifier = Modifier.padding(padding)) {
                // Your home content
                Button(onClick = { navController.navigate(Routes.Search.route) }) {
                    Text("Go to Search")
                }
            }
        }
    )
}