package com.example.android.architecture.blueprints.todoapp

import androidx.activity.ComponentActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import com.example.android.architecture.blueprints.todoapp.HelloWorldScreen

class TodoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { 
            Scaffold {
                HelloWorldScreen()
            }
        }
    }
}