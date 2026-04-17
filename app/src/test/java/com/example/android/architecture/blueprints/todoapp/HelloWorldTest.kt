import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.assertIsDisplayed
import org.junit.Rule
import org.junit.Test

class HelloWorldTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun helloWorldIsDisplayed() {
        composeTestRule.setContent { SimpleHelloWorld() }
        composeTestRule.onNodeWithText("Hello World").assertIsDisplayed()
    }
}