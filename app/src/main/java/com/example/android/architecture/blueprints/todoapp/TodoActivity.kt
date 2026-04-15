package com.example.android.architecture.blueprints.todoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class TodoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { 
            HelloWorld() 
        }
    }

    @Composable
    fun HelloWorld() {
        Text(text = "Hello Ivan")
    }

    @Preview
    @Composable
    fun PreviewHelloWorld() {
        HelloWorld()
    }
}