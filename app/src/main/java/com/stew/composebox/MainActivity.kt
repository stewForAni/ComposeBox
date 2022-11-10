package com.stew.composebox

import android.graphics.Paint.Align
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.ClipOp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.graphics.drawscope.inset
import androidx.compose.ui.graphics.drawscope.scale
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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


//    LazyColumn(
//        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 10.dp),
//        verticalArrangement = Arrangement.spacedBy(10.dp)
//    ) {
//        item {
//            Text(text = "Hello First", Modifier.background(Color.Cyan))
//        }
//        items(50) {
//            Text(text = "Hello $it", Modifier.background(Color.Cyan))
//        }
//        item {
//            Text(text = "Hello End", Modifier.background(Color.Cyan).clickable {
//                Log.d("MainActivity", "123456")
//            })
//        }
//    }

//    val a = rememberSaveable { mutableStateOf("") }
//    Column {
//        TextField(
//            value = a.value,
//            onValueChange = {
//                Log.d("MainActivity", it)
//                a.value = it
//            },
//            label = { Text(text = "123456", color = Color.White, fontSize = 20.sp) },
//            modifier = Modifier
//                .background(Color.Blue)
//                .size(200.dp, 70.dp),
//            textStyle = TextStyle(
//                color = Color.White,
//                fontSize = 20.sp,
//                textAlign = TextAlign.Center
//            )
//        )
//    }

//    Canvas(modifier = Modifier.fillMaxSize(), onDraw = {
//        Log.d("MainActivity", size.width.toString())
//        Log.d("MainActivity", size.height.toString())
//
//        clipRect(200f,200f, clipOp = ClipOp.Difference) {
//            drawRect(color = Color.Red)
//        }
//
//        drawCircle(
//            color = Color.Blue,
//            radius = 300f,
//            center = Offset(size.width / 2, size.height / 2)
//        )
//
//        translate(top = 100f, left = 100f){
//            drawCircle(
//                color = Color.Yellow,
//                radius = 300f,
//                center = Offset(size.width / 2, size.height / 2)
//            )
//        }
//
//        scale(scale = 0.6f){
//            drawCircle(
//                color = Color.Cyan,
//                radius = 300f,
//            )
//        }
//
//    })

//    val a = rememberSaveable { mutableStateOf("") }
//    Column {
//        OutlinedTextField(
//            value = a.value,
//            onValueChange = {
//                Log.d("MainActivity", it)
//                a.value = it
//            },
//            label = { Text(text = "123456", color = Color.LightGray, fontSize = 20.sp) },
//            modifier = Modifier.padding(start = 10.dp)
//                .background(Color.White)
//                .size(200.dp, 70.dp),
//            textStyle = TextStyle(
//                color = Color.DarkGray,
//                fontSize = 20.sp,
//                textAlign = TextAlign.Center
//            )
//        )
//    }

    Column {

        AnimatedVisibility(
            visible = false,
            enter = fadeIn(),
            exit = fadeOut()
        ) {
            Box(Modifier.background(Color.LightGray)) {
                Box(
                    Modifier
                        .size(100.dp, 100.dp)
                        .background(Color.Blue)
                )
                Box(
                    Modifier
                        .size(100.dp, 100.dp)
                        .background(Color.Blue)
                )
            }
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