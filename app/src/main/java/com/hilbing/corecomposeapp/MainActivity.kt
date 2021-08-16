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
        Row {
            Surface(
                color = Color.Gray,
                modifier = Modifier
                    .height(600.dp)
                    .width(60.dp)
            ) {}
            Surface(
                color = Color.Green,
                modifier = Modifier
                    .height(600.dp)
                    .width(60.dp)
            ) {}
        }


    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CoreComposeAppTheme {
        MainScreen()
    }
}