package com.example.android.architecture.blueprints.todoapp

import androidx.compose.material.ContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.assertIsDisplayed
import org.junit.Rule
import org.junit.Test

class HelloWorldScreenTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun helloWorldScreen_displaysHelloWorld() {
        composeTestRule.setContent { 
            MaterialTheme { 
                HelloWorldScreen()
            } 
        }
        // Verify that the text 'Hello World' is displayed
        composeTestRule.onNodeWithText("Hello World", useUnmergedTree = true)
            .assertIsDisplayed()
    }
}