package com.example.bondjio.ui.navigation

sealed class Routes(val route: String) {
    object Home : Routes("home")
    object Search : Routes("search")
    object Tickets : Routes("tickets")
    object Community : Routes("community")
    object Account : Routes("account")
}