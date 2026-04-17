package com.example.android.architecture.blueprints.todoapp

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.junit4.ComposeTestRule
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import org.junit.Rule
import org.junit.Test

class HelloWorldScreenTest {
    @get:Rule
    val composeTestRule: ComposeTestRule = createComposeRule()

    @Test
    fun helloWorld_isDisplayed() {
        composeTestRule.setContent { 
            HelloWorldComposable()
        }
        composeTestRule.onNodeWithText("Hello, World!").assertIsDisplayed()  
    }
}