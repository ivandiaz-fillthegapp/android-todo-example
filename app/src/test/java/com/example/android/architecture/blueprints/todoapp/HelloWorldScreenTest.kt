package com.example.android.architecture.blueprints.todoapp

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.ComposeTestRule
import org.junit.Rule
import org.junit.Test

class HelloWorldScreenTest {
    @get:Rule
    val composeRule = createComposeRule()

    @Test
    fun helloWorld_isDisplayed() {
        composeRule.setContent { 
            HelloWorldScreen()
        }
        composeRule.onNodeWithText("Hello World").assertIsDisplayed()
    }
}