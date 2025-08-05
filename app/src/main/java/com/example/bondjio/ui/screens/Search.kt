package com.example.bondjio.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.bondjio.ui.navigation.BottomNavBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Search(navController: NavController) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Search") }) },
        bottomBar = { BottomNavBar(navController) },
        content = { padding ->
            Column(modifier = Modifier.padding(padding)) {
                Text("Search Filters")
            }
        }
    )
}