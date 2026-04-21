package com.example.android.architecture.blueprints.todoapp

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.android.architecture.blueprints.todoapp.HelloWorldScreen

fun NavGraphBuilder.todoNavGraph() {
    composable(route = "hello") { HelloWorldScreen() }
}