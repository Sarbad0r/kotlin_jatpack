package com.example.kotlin_jetpack.state


import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _mainState = mutableStateOf(MainState())
    val mainState: State<MainState> = _mainState


    sealed class MainEvent {
        object IncrementCounter : MainEvent();
        object AnotherCounter : MainEvent();
    }


    fun incrementAndDecrement(event: MainEvent) {
        when (event) {
            MainEvent.IncrementCounter -> {
                var stateCounter = _mainState.value.counter
                stateCounter++
                _mainState.value = mainState.value.copy(counter = stateCounter)
            }
            MainEvent.AnotherCounter -> {
                var stateAnotherCounter = _mainState.value.anotherCouner
                stateAnotherCounter++
                _mainState.value = mainState.value.copy(anotherCouner = stateAnotherCounter)
            }
        }
    }
}