package com.hilbing.corecomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
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
        Surface(
            color = Color.Gray,
            modifier = Modifier.wrapContentSize(
                align = Alignment.BottomStart
            )
        ) {
            Text(
                text = "Wrapped content",
                style = MaterialTheme.typography.h4)
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