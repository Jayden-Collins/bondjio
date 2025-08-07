package com.example.bondjio.ui.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bondjio.ui.theme.BondjioTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import com.example.bondjio.ui.navigation.BottomNavBar
import com.example.bondjio.ui.navigation.Routes
import androidx.navigation.NavController
import com.example.bondjio.ui.navigation.TopBar

@Composable
fun WelcomeBack(modifier: Modifier = Modifier, navController: NavController) {
    Scaffold(
        topBar = { TopBar() },
        bottomBar = { BottomNavBar(navController) },
        content = { padding ->
            Column(modifier = modifier) {

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .fillMaxWidth()
                        .height(600.dp)
                        .clip(RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp)) // set curve top corner
                        .background(Color(0xFFAA00FF)) // Set background to purple
                ) {
                    Column(
                        modifier = modifier
                            .fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Welcome Back!!",
                            fontWeight = FontWeight.Bold,
                            fontSize = 45.sp,
                            lineHeight = 10.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(top = 40.dp),
                            color = Color.White
                        )
                        Text(
                            text = "Please login to continue",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,
                            color = Color.White
                        )
                        Text(
                            text = "Username or Email",
                            modifier = Modifier.padding(start = 0.dp, end = 180.dp, top = 30.dp),
                            color = Color.White
                        )

                        UsernameField() // Input username box

                        Text(
                            text = "Password",
                            modifier = Modifier.padding(start = 10.dp, end = 260.dp, top = 20.dp),
                            color = Color.White
                        )

                        PasswordField() // Input Password box

                    }
                }
            }
        }
    )

}

@Composable
fun UsernameField(modifier: Modifier = Modifier){
    TextField(
        value = "",
        onValueChange = {},
        modifier = modifier
            .width(400.dp)
            .height(50.dp)
            .padding(start = 30.dp, end = 30.dp)
    )
}

@Composable
fun PasswordField(modifier: Modifier = Modifier){
    TextField(
        value = "",
        onValueChange = {},
        modifier = modifier
            .width(400.dp)
            .height(50.dp)
            .padding(start = 30.dp, end = 30.dp)
    )
}