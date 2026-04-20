package com.example.android.architecture.blueprints.todoapp

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class HelloWorldScreenTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<TodoActivity>()

    @Test
    fun helloWorldScreen_displaysText() {
        composeTestRule.setContent {
            HelloWorldScreen()
        }
        composeTestRule.onNodeWithText("Hello, World!").assertExists()
    }
}