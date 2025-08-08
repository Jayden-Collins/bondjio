package com.example.bondjio.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.bondjio.R
import com.example.bondjio.data.model.Event
import java.text.SimpleDateFormat
import java.util.Locale

@Composable
fun EventCard(event: Event) {
    val date = SimpleDateFormat("d MMM, h:mma", Locale.getDefault()).format(event.date.toDate())

    Card(
        //elevation = CardDefaults.cardElevation(4.dp),
        modifier = Modifier
            .size(190.dp)
    ) {
        Box(
           modifier = Modifier.fillMaxSize()
        ) {
            // Load image from Firestore URL
            AsyncImage(
                model = event.img, // imageUrl from Firestore
                contentDescription = "Event Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier.matchParentSize()
            )

            Column(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .background(Color.White)
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(4.dp),
                    modifier = Modifier
                        .padding(8.dp)
                ){
                    // Event name
                    Text(event.name, style = MaterialTheme.typography.labelMedium)

                    // Event details
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ){
                        // Location icon
                        Icon(
                            painterResource(R.drawable.ic_location),
                            contentDescription = "Location Icon",
                            modifier = Modifier.padding(end = 4.dp)
                        )

                        // Location
                        Text(
                            "${event.location}",
                            style = MaterialTheme.typography.bodyLarge,
                            modifier = Modifier.fillMaxWidth())

                    }
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ){
                        // Date icon
                        Icon(
                            painterResource(R.drawable.ic_date),
                            contentDescription = "Location Icon",
                            modifier = Modifier.padding(end = 4.dp)
                        )

                        // Date, format to dd MMM, time in 11 hour format
                        Text(date, style = MaterialTheme.typography.bodyLarge, modifier = Modifier.fillMaxWidth())
                    }

                    // Price
                    // from RMxx.xx/person
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ){
                        Text("From ", style = MaterialTheme.typography.bodyLarge)
                        Text("RM${String.format("%.2f", event.price)}", style = MaterialTheme.typography.labelMedium)
                        Text(" /person", style = MaterialTheme.typography.bodyLarge)
                    }

                    // Make the card clickable to navigate to event details
                }
            }
        }
    }
}
