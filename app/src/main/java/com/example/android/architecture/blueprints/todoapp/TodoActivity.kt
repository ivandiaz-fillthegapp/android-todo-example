// Other imports
import com.example.android.architecture.blueprints.todoapp.HelloWorldScreen
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.activity.compose.setContent

class TodoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent { 
            Scaffold {
                HelloWorldScreen()
            }
        }
    }
}