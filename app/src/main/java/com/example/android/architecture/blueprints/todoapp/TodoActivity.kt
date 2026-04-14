package com.example.android.architecture.blueprints.todoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.android.architecture.blueprints.todoapp.ui.theme.TodoAppTheme

class TodoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TodoAppTheme { // Apply your theme
                GreetingScreen()
            }
        }
    }
}

@Composable
fun GreetingScreen() {
    Text(text = "Hi Iván")
    Button(onClick = { /* TODO: Add action to greet again */ }) {
        Text(text = "Greet Again")
    }
}

@Preview
@Composable
fun PreviewGreetingScreen() {
    GreetingScreen()
}