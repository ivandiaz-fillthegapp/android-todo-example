package com.example.android.architecture.blueprints.todoapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.android.architecture.blueprints.todoapp.ui.theme.TodoTheme

class TodoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TodoTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Ivan")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    TextView(text = "Hello $name")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TodoTheme {
        Greeting("Ivan")
    }
}