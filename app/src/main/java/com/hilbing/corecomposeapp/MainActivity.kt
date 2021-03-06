package com.hilbing.corecomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hilbing.corecomposeapp.ui.theme.CoreComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen(){
    Surface(
        color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                HorizontalColoredBar(color = Color.Cyan)
                HorizontalColoredBar(color = Color.LightGray)
            }
            HorizontalColoredBar(Color.White)
            HorizontalColoredBar(Color.Green)
            HorizontalColoredBar(Color.Blue)
            HorizontalColoredBar(Color.Yellow)
            HorizontalColoredBar(Color.Red)
        }
    }
}

@Composable
fun HorizontalColoredBar(color: Color){
    Surface(
        color = color,
        modifier = Modifier
            .height(25.dp)
            .width(35.dp)
    ) {}
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CoreComposeAppTheme {
        MainScreen()
    }
}