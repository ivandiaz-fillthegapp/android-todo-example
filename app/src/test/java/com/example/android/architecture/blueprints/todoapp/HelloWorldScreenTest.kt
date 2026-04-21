package com.example.android.architecture.blueprints.todoapp

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.onNode
import androidx.compose.ui.test.performClick
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.ext.junit.runners.AndroidJUnit4

@RunWith(AndroidJUnit4::class)
class HelloWorldScreenTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun helloWorldScreen_displaysHelloWorld() {
        composeTestRule.setContent {
            HelloWorldScreen()
        }
        composeTestRule
            .onNode(hasText("Hello World"))
            .assertExists()
    }
}