package com.example.android.architecture.blueprints.todoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class HelloWorldActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { 
            HelloWorldScreen()
        }
    }
}

@Composable
fun HelloWorldScreen() {
    Surface(color = MaterialTheme.colorScheme.background) {
        Text(text = "Hello, World!")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHelloWorldScreen() {
    HelloWorldScreen()
}