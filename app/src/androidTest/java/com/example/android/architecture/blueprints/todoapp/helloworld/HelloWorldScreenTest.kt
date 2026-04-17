package com.example.android.architecture.blueprints.todoapp.helloworld

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.junit4.ComposeTestRule
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.onNodeWithText
import org.junit.Rule
import org.junit.Test

class HelloWorldScreenTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun helloWorldScreen_displaysHelloWorld() {
        composeTestRule.setContent { HelloWorldScreen() }
        composeTestRule.onNodeWithText("Hello World").assertIsDisplayed()
    }
}