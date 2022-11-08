package com.stew.composebox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.stew.composebox.ui.theme.ComposeBoxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBoxTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Row(horizontalArrangement = Arrangement.SpaceAround) {
        Column(Modifier.background(color = Color.Gray)) {
            Text(text = "Hello $name!")
            Text("cool stew1")
            Text("cool stew2")
        }
        Column(Modifier.background(color = Color.Magenta)) {
            Text(text = "Hello $name!")
            Text("cool stew1")
            Text("cool stew2")
        }
    }
    Box(
        Modifier.fillMaxSize().padding(top = 100.dp).background(color = Color.Cyan)
    ) {
        Box(
            Modifier.background(color = Color.Red).align(Alignment.Center).size(100.dp, 100.dp)
        )
        Box(
            Modifier.background(color = Color.Red).size(100.dp, 100.dp)
        )
    }
}

@Preview(showBackground = true, device = Devices.PIXEL_4_XL, showSystemUi = true)
@Composable
fun DefaultPreview() {
    ComposeBoxTheme {
        Greeting("Android")
    }
}