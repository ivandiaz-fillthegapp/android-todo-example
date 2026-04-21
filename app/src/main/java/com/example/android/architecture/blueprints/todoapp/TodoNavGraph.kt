import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

fun NavGraphBuilder.todoNavGraph() {
    composable(route = "helloWorld") { 
        HelloWorldScreen() 
    }
}