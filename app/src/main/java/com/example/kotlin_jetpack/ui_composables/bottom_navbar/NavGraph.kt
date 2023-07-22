package com.example.kotlin_jetpack.ui_composables.bottom_navbar

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController = navController,
        startDestination = BottomItem.screen1.route,
        builder = {
            composable(BottomItem.screen1.route) {
                HomeScreen()
            }
            composable(BottomItem.screen2.route) {
                NetworkScreen()
            }
            composable(BottomItem.screen3.route) {
                AddPostScreen()
            }
        })
}