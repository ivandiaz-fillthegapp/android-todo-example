import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.android.architecture.blueprints.todoapp.ui.HelloWorldScreen

fun NavGraphBuilder.addHelloWorldScreen() {
    composable(route = "hello") {
        HelloWorldScreen()
    }
}