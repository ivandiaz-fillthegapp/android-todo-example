package com.example.android.architecture.blueprints.todoapp

import androidx.navigation.NavGraph
import androidx.navigation.compose.composable
import androidx.navigation.NavHostController

fun NavGraph.addHelloWorldScreen(navController: NavHostController) {
    composable("helloWorld") { HelloWorldScreen() }
}