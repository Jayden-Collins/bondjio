package com.example.bondjio.ui.navigation

sealed class Routes(val route: String) {
    object Home : Routes("home")
    object Search : Routes("search")
    object Tickets : Routes("tickets")
    object Community : Routes("community")
    object Account : Routes("account")
    object EventDetail : Routes("event_detail")
    //object EventDetail : Routes("event_detail/{eventId}") {
        //fun createRoute(eventId: String) = "event_detail/$eventId"
    //}
}