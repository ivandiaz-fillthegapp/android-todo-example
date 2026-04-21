package com.example.android.architecture.blueprints.todoapp

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

fun NavGraphBuilder.todoNavGraph() {
    composable(route = "hello") { HelloWorldScreen() }
}