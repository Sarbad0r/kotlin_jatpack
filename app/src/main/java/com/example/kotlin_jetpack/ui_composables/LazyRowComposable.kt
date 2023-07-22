package com.example.kotlin_jetpack.ui_composables

import android.widget.Space
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.kotlin_jetpack.R
import com.example.kotlin_jetpack.models.ScientistModel

@Composable
fun LazyRowComposable() {
    val scientistModels: List<ScientistModel> = ScientistModel.listOfScientist
    LazyRow(modifier = Modifier.fillMaxWidth()) {
        itemsIndexed(scientistModels) { index, item ->
            Card(modifier = Modifier
                .padding(5.dp), backgroundColor = Color.White, elevation = 5.dp) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Box(modifier = Modifier.size(100.dp)) {
                        Image(painter = painterResource(id = item.image!!),
                            contentDescription = "image_${item.name}",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.clip(CircleShape))
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(text = "${item.name}",
                        style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold))
                }
            }
        }
    }
}