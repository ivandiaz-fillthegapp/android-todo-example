package com.example.android.architecture.blueprints.todoapp

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HelloWorldScreen() {
    Text(text = "Hello, World!")
}

@Preview
@Composable
fun PreviewHelloWorldScreen() {
    HelloWorldScreen()
}