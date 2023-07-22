package com.example.kotlin_jetpack.ui_composables

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlin_jetpack.R.drawable.ic_launcher_background

@Composable
fun CardComposable(name: String, prof: String?) {
    val counter = remember {
        mutableStateOf(0)
    }
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)
        //just a clickable
//        .clickable {
//            Log.d("Привет мир!", "Clicked")
//        },
        .pointerInput(Unit) {
            //detects only after taping on screen
            detectTapGestures {
                counter.value++
                Log.d("Press", "counter pressed : $counter")
            }


            //detects tap after long press
//            detectDragGesturesAfterLongPress { change, dragAmount ->
//                Log.d("Press", "Long Press : $dragAmount")
//            }

        },
        shape = RoundedCornerShape(10.dp), elevation = 5.dp) {
        Box(modifier = Modifier.padding(10.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(painter = painterResource(id = ic_launcher_background),
                    contentDescription = "image",
                    contentScale = ContentScale.FillHeight,
                    modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape))
                Spacer(modifier = Modifier.width(10.dp))
                Column(modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center) {
                    Text(text = name,
                        style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 20.sp))
                    prof?.let {
                        Text(text = it,
                            style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 20.sp))
                    }
                    Text(text = "Number: ${counter.value}")
                }
            }
        }
    }
}

@Preview
@Composable
fun ForPreview() {
    CardComposable(name = "Avaz", prof = "Programmer")
}