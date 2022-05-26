package com.sample.logglyticsdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sample.library.Level
import com.sample.library.Logger
import com.sample.logglyticsdemo.ui.theme.LogglyticsDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LogglyticsDemoTheme {
                HomeScreen()
            }
        }
    }
}

@Composable
fun HomeScreen() {
    Scaffold(topBar = {
        DemoAppBar()
    }) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Button(onClick = { 
                Logger.event("FEATURE_1")
            }) {
                Text(text = "Feature 1")
            }
            Button(onClick = {
                Logger.event("FEATURE_2")
            }) {
                Text(text = "Feature 2")
            }
            Button(onClick = {
                Logger.log(Level.INFO, "Power")
            }) {
                Text(text = "Log: POWER")
            }
        }
    }
}
