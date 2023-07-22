package com.example.kotlin_jetpack.ui_composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TopAppBar() {
    Column(modifier = Modifier
        .height(height = 200.dp)
        .background(color = Color(0xFF4472C4))
        .fillMaxWidth()) {
        Spacer(modifier = Modifier.height(height = 30.dp))
        Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Where do you want to travel",
                style = TextStyle(color = Color.White,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold))
        }
        Spacer(modifier = Modifier.height(height = 20.dp))
        Row(modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Box(modifier = Modifier
                .size(50.dp)
                .background(Color.White, shape = RoundedCornerShape(10.dp)),
                contentAlignment = Alignment.Center) {
                Icon(imageVector = Icons.Default.Favorite, contentDescription = "Favorite Icon")
            }
            Box(modifier = Modifier
                .padding(30.dp)
                .background(color = Color.White, shape = RoundedCornerShape(10.dp))) {
                Text(text = "Select all stuff that you want", modifier = Modifier.padding(10.dp))
            }

            Box(modifier = Modifier
                .size(50.dp)
                .background(Color.White, shape = RoundedCornerShape(10.dp)),
                contentAlignment = Alignment.Center) {
                Icon(imageVector = Icons.Default.Search, contentDescription = "Favorite Icon")
            }
        }
    }
}