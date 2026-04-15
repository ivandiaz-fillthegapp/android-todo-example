import androidx.navigation.compose.composable

// ... existing imports
import com.example.android.architecture.blueprints.todoapp.RegistrationScreen

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(navController, startDestination = "home") {
        // ... existing destinations
        composable("register") { RegistrationScreen(navController) }
        // ... other destinations
    }
}