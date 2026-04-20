package com.example.android.architecture.blueprints.todoapp

import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun TodoNavGraph(navController: NavController) {
    NavHost(navController, startDestination = "helloWorld") {
        composable("helloWorld") { HelloWorldScreen() }
        // ... other destinations
    }
}