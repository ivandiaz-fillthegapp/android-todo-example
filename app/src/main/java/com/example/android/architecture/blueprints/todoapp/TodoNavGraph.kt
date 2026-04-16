package com.example.android.architecture.blueprints.todoapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun TodoNavGraph(navController: NavHostController) {
    NavHost(navController, startDestination = "todo") {
        // Existing composable for todo
        composable("todo") { /* Your TODO Screen */ }

        // New Hello World Activity
        composable("hello") { HelloWorldActivity() }
    }
}