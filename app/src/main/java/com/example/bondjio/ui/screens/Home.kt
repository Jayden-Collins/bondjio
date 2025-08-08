package com.example.bondjio.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.bondjio.ui.components.EventCard
import com.example.bondjio.ui.navigation.BottomNavBar
import com.example.bondjio.ui.navigation.TopBar

@Composable
fun Home(
    navController: NavController,
    viewModel: HomeViewModel = viewModel()
    ) {
    val events by viewModel.events.collectAsState()
    val isLoading by viewModel.isLoading.collectAsState()

    Scaffold(
        topBar = { TopBar() },
        bottomBar = { BottomNavBar(navController) },
        content = { padding ->
            Column(
                modifier = Modifier.padding(padding)
            ) {
                Column(
                    modifier = Modifier.padding(horizontal = 16.dp)
                ){
                    Text(text = "Popular Today", style = MaterialTheme.typography.titleLarge)
                    Text(text = "Hot in Penang", style = MaterialTheme.typography.titleLarge)

                    if (isLoading) {
                        CircularProgressIndicator()
                    } else {
                        LazyRow(
                            horizontalArrangement = Arrangement.spacedBy(16.dp)
                        ) {
                            items(events) { event ->
                                EventCard(event = event)
                            }
                        }
                    }

                    Text(text = "Friends Are Going", style = MaterialTheme.typography.titleLarge)
                    Text(text = "Your Circle's Picks", style = MaterialTheme.typography.titleLarge)
                    Text(text = "#Comedy", style = MaterialTheme.typography.titleLarge)
                }
            }
        }
    )
}