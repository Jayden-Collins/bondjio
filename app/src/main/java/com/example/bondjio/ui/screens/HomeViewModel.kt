package com.example.bondjio.ui.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bondjio.data.model.Event
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {
    private val db = Firebase.firestore
    val events = MutableStateFlow<List<Event>>(emptyList())
    val isLoading = MutableStateFlow(true)

    init {
        fetchEvents()
    }

    private fun fetchEvents() {
        viewModelScope.launch {
            try {
                db.collection("events")
                    .get()
                    .addOnSuccessListener { result ->
                        events.value = result.toObjects(Event::class.java)
                        isLoading.value = false
                    }
            } catch (e: Exception) {
                // Handle error
            }
        }
    }
}