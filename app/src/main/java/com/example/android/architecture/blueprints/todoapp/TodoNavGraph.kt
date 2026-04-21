package com.example.android.architecture.blueprints.todoapp.navgraph

import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.android.architecture.blueprints.todoapp.HelloWorldScreen

@Composable
fun TodoNavGraph(navController: NavController) {
    NavHost(navController = navController, startDestination = "helloWorld") {
        composable("helloWorld") { HelloWorldScreen() }
    }
}