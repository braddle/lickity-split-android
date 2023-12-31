package net.markbradley.lickitysplit

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import net.markbradley.lickitysplit.ui.theme.LickitySplitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LickitySplitTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FindButton()
                }
            }
        }
    }
}

@Composable
fun FindButton() {
    Button(onClick = { Log.d("button", "find ice cream")}) {
        Text("Find Ice Cream")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LickitySplitTheme {
        FindButton()
    }
}