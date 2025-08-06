package com.example.bondjio.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.bondjio.ui.navigation.BottomNavBar
import com.example.bondjio.ui.navigation.TopBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(navController: NavController) {
    Scaffold(
        topBar = { TopBar() },
        bottomBar = { BottomNavBar(navController) },
        content = { padding ->
            Column(
                modifier = Modifier.padding(padding)
            ) {
                Column(
                    modifier = Modifier.padding(horizontal = 8.dp)
                ){
                    Text(text = "Popular Today", style = MaterialTheme.typography.titleLarge)
                    Text(text = "Hot in Penang", style = MaterialTheme.typography.titleLarge)
                    Text(text = "Friends Are Going", style = MaterialTheme.typography.titleLarge)
                    Text(text = "Your Circle's Picks", style = MaterialTheme.typography.titleLarge)
                    Text(text = "#Comedy", style = MaterialTheme.typography.titleLarge)
                }
            }
        }
    )
}