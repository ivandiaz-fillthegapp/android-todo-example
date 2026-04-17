// Import necessary components for navigation
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.android.architecture.blueprints.todoapp.hello.HelloWorldScreen

fun NavGraphBuilder.todoNavGraph() {
    // Add the new Hello World screen to the navigation graph
    composable("hello_world") { HelloWorldScreen() }
}