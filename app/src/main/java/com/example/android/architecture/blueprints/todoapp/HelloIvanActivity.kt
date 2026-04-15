package com.example.android.architecture.blueprints.todoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.android.architecture.blueprints.todoapp.ui.theme.TodoTheme

class HelloIvanActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { 
            HelloIvanScreen() 
        }
    }
}

@Composable
fun HelloIvanScreen() {
    Text(text = "Hello Ivan")
}

@Preview(showBackground = true)
@Composable
fun PreviewHelloIvan() {
    HelloIvanScreen()
}