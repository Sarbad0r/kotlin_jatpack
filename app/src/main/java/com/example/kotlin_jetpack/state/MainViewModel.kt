package com.example.kotlin_jetpack.state


import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _state = mutableStateOf(MainState())
    val state: State<MainState> = _state

    sealed class MainEvent {
        object IncrementCounter : MainEvent();
    }


    fun increment(event: MainEvent) {
        when (event) {
            MainEvent.IncrementCounter -> {
                _state.value = state.value.copy(counter = state.value.counter + 1);
            }
        }
    }
}