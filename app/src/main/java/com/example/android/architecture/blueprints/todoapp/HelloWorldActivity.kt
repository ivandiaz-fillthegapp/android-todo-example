package com.example.android.architecture.blueprints.todoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class HelloWorldActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView = TextView(this)
        textView.textSize = 40f
        textView.text = "Hello Ivan"
        setContentView(textView)
    }
}