package com.example.bondjio.data.model

import com.google.firebase.Timestamp

data class Event(
    val name: String = "",
    val date: Timestamp = Timestamp.now(),
    val location: String = "",
    val state: String = "",
    val price: Double = 0.0,
    val totalTickets: Int = 0,
    val ticketsLeft: Int = 0,
    val interests: List<String> = emptyList(),
    val img: String = ""
)
