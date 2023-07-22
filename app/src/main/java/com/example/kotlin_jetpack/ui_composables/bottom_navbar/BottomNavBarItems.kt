package com.example.kotlin_jetpack.ui_composables.bottom_navbar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector


sealed class BottomItem(var name: String, var route: String, var icon: ImageVector) {
    object screen1 : BottomItem(name = "First", route = "first_screen", icon = Icons.Default.Home)

    object screen2 : BottomItem(name = "Second", route = "second_screen", icon = Icons.Default.Menu)

    object screen3 : BottomItem(name = "Third", route = "third_screen", icon = Icons.Default.Search)
}