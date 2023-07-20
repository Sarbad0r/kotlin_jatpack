package com.example.kotlin_jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlin_jetpack.ui.theme.Kotlin_jetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var counter: Int = 1;
        setContent {
            Column(
                modifier = Modifier.fillMaxSize()
            ) {
                TopWidget()
                CardWidget(name = "Avaz", prof = "Programmer")
                CardWidget(name = "PopUp", prof = "Programmer")
                CardWidget(name = "Tennis", prof = "Programmer")
            }
        }
    }
}


@Composable
fun TopWidget() {
    Column(
        modifier = Modifier
            .height(height = 200.dp)
            .background(color = Color(0xFF4472C4))
            .fillMaxWidth()
    ) {
        Spacer(modifier = Modifier.height(height = 30.dp))
        Row(
            horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Where do you want to travel", style = TextStyle(
                    color = Color.White,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold
                )
            )
        }
        Spacer(modifier = Modifier.height(height = 20.dp))
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(Color.White, shape = RoundedCornerShape(10.dp)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Favorite, contentDescription = "Favorite Icon"
                )
            }
            Box(
                modifier = Modifier
                    .padding(30.dp)
                    .background(color = Color.White, shape = RoundedCornerShape(10.dp))
            ) {
                Text(text = "Select all stuff that you want", modifier = Modifier.padding(10.dp))
            }

            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(Color.White, shape = RoundedCornerShape(10.dp)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Search, contentDescription = "Favorite Icon"
                )
            }
        }
    }
}

@Composable
fun CardWidget(name: String, prof: String?) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        shape = RoundedCornerShape(10.dp),
        elevation = 5.dp
    ) {
        Box(
            modifier = Modifier.padding(10.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = "image",
                    contentScale = ContentScale.FillHeight,
                    modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column(
                    modifier = Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = name,
                        style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 20.sp)
                    )
                    prof?.let {
                        Text(
                            text = it,
                            style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 20.sp)
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun ForPreview() {
    CardWidget(name = "Avaz", prof = "Programmer")
}