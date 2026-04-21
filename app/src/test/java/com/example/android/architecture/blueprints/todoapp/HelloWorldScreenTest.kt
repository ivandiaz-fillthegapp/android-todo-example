package com.example.android.architecture.blueprints.todoapp

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.junit4.ComposeTestRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.assertIsDisplayed
import org.junit.Rule
import org.junit.Test

class HelloWorldScreenTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun helloWorldScreen_displaysHelloWorld() {
        composeTestRule.setContent { 
            HelloWorldScreen() 
        }
        composeTestRule.onNodeWithText("Hello World").assertIsDisplayed()
    }
}