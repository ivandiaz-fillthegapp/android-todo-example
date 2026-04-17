import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.unit.dp

class TodoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { SimpleHelloWorld() }
    }
}

@Composable
fun SimpleHelloWorld() {
    Surface(color = MaterialTheme.colors.background) {
        Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
            Text(text = "Hello, World!")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHelloWorld() {
    SimpleHelloWorld()
}