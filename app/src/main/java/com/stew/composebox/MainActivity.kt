package com.stew.composebox

import android.graphics.Paint.Align
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
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
//    Row(horizontalArrangement = Arrangement.SpaceAround) {
//        Column(Modifier.background(color = Color.Gray)) {
//            Text(text = "Hello $name!")
//            Text("cool stew1")
//            Text("cool stew2")
//        }
//        Column(Modifier.background(color = Color.Magenta)) {
//            Text(text = "Hello $name!")
//            Text("cool stew1")
//            Text("cool stew2")
//        }
//    }
//    Box(
//        Modifier.fillMaxSize().padding(top = 100.dp).background(color = Color.Cyan)
//    ) {
//        Box(
//            Modifier.background(color = Color.Red).align(Alignment.Center).size(100.dp, 100.dp)
//        )
//        Box(
//            Modifier.background(color = Color.Red).size(100.dp, 100.dp)
//        )
//    }


//    Column(Modifier.fillMaxSize()) {
//        Column(Modifier.size(100.dp, 500.dp).background(Color.Gray)) {
//            Row(
//                Modifier
//                    .background(Brush.verticalGradient(listOf(Color.Green, Color.Blue)))
//                    .size(100.dp, 100.dp)
//            ) {}
//
//            Row(
//                Modifier
//                    .border(4.dp, Color.Red)
//                    .background(Color.Blue)
//                    .size(100.dp, 100.dp)
//                    .clickable {
//                        Log.d("MainActivity", "123456")
//                    }
//            ) {}
//
//            Row(
//                Modifier
//                    .rotate(45f)
//                    .scale(0.5f)
//                    .background(Color.Cyan)
//                    .size(100.dp, 100.dp)
//            ) {}
//
//            Row(
//                Modifier.background(Color.Red).size(100.dp, 100.dp).padding(10.dp)
//            ) {}
//
//            Row(
//                Modifier.padding(10.dp).background(Color.Red).size(100.dp, 100.dp)
//            ) {}
//        }
//    }


//    Column {
//        Text(
//            text = "Hello Compose",
//            Modifier
//                .background(Color.Gray)
//                .size(200.dp, 50.dp)
//        )
//        Text(text = "Hello Compose", Modifier.background(Color.Cyan))
//        Image(
//            painter = painterResource(id = R.drawable.ic_launcher_foreground),
//            contentDescription = null,
//            Modifier.padding(top = 10.dp).size(200.dp, 100.dp).background(Color.Magenta),
//            alignment = Alignment.TopStart
//        )
//        Image(
//            painter = painterResource(id = R.drawable.ic_launcher_foreground),
//            contentDescription = null,
//            Modifier.padding(top = 10.dp).size(200.dp, 100.dp).background(Color.Magenta),
//            contentScale = ContentScale.FillBounds
//        )
//    }


    LazyColumn(
        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        item {
            Text(text = "Hello First", Modifier.background(Color.Cyan))
        }
        items(50) {
            Text(text = "Hello $it", Modifier.background(Color.Cyan))
        }
        item {
            Text(text = "Hello End", Modifier.background(Color.Cyan).clickable {
                Log.d("MainActivity", "123456")
            })
        }
    }


}

@Preview(showBackground = true, device = Devices.PIXEL_4_XL, showSystemUi = true)
@Composable
fun DefaultPreview() {
    ComposeBoxTheme {
        Greeting("Android")
    }
}