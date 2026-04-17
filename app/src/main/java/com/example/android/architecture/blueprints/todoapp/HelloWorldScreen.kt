package com.example.android.architecture.blueprints.todoapp

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier

@Composable
fun HelloWorldScreen() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Text(text = "Hello, World!")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HelloWorldScreen()
}