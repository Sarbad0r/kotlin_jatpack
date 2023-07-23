package com.example.kotlin_jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.kotlin_jetpack.state.MainViewModel
import com.example.kotlin_jetpack.ui_composables.CardComposable
import com.example.kotlin_jetpack.ui_composables.LazyColumnComposable
import com.example.kotlin_jetpack.ui_composables.LazyRowComposable
import com.example.kotlin_jetpack.ui_composables.TopAppBar
import com.example.kotlin_jetpack.ui_composables.bottom_navbar.MainScreenWithBottomNavBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            MainScreenWithBottomNavBar()
            Column(modifier = Modifier.fillMaxSize()) {
//                TopAppBar()
////                Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
////                    CardComposable(name = "Avaz", prof = "Programmer")
////                    CardComposable(name = "PopUp", prof = "Programmer")
////                    CardComposable(name = "Tennis", prof = "Programmer")
////                    CardComposable(name = "Tennis", prof = "Programmer")
////                    CardComposable(name = "Tennis", prof = "Programmer")
////                    CardComposable(name = "Tennis", prof = "Programmer")
////                    CardComposable(name = "Tennis", prof = "Programmer")
////                    CardComposable(name = "Tennis", prof = "Programmer")
////                    CardComposable(name = "Tennis", prof = "Programmer")
////                    CardComposable(name = "Tennis", prof = "Programmer")
////                    IncrementButton()
////                }
////                LazyColumnComposable()
            IncrementButton()
//                LazyRowComposable()
            }
        }
    }
}

@Composable
fun IncrementButton(
    viewModel: MainViewModel = viewModel(),
) {
    val currentState = viewModel.mainState.value;
    TextButton(onClick = {
        println("clicking${currentState.counter}")
        viewModel.incrementAndDecrement(MainViewModel.MainEvent.IncrementCounter)
    }) {

        Text(text = "Increment")
    }
    Text(text = "${currentState.counter}")
    Text(text = "${currentState.anotherCouner}")
    TextButton(onClick = {
        println("clicking${currentState.counter}")
        viewModel.incrementAndDecrement(MainViewModel.MainEvent.AnotherCounter)
    }) {

        Text(text = "Decrement")
    }
}

