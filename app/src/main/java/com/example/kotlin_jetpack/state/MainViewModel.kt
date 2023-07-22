package com.example.kotlin_jetpack.state


import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _state = mutableStateOf(MainState())
    val state: State<MainState> = _state

    sealed class MainEvent {
        object IncrementCounter : MainEvent();
        object DecrementCounter : MainEvent();
    }


    fun incrementAndDecrement(event: MainEvent) {
        when (event) {
            MainEvent.IncrementCounter -> {
                _state.value.counter++
                Log.d("MainState", "Counter: ${_state.value.counter}")
            }
            MainEvent.DecrementCounter -> {
                if (_state.value.counter <= 0) return;
                _state.value.counter--
                Log.d("MainState", "Counter Minus: ${_state.value.counter}")
            }
        }
    }
}