package com.example.android.architecture.blueprints.todoapp

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.assertIsDisplayed
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class HelloWorldScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun helloWorldScreen_displaysHelloWorld() {
        // Set the Composable to be tested
        composeTestRule.setContent { HelloWorldScreen() }

        // Assert that 'Hello World' is displayed
        composeTestRule.onNodeWithText("Hello World").assertIsDisplayed()
    }
}