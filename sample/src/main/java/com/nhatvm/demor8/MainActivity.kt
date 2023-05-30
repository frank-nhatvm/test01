package com.nhatvm.demor8

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nhatvm.demor8.ui.theme.DemoR8Theme
import com.nhatvm.pairingsdk.navigation.namiPairingGraph


class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DemoR8Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}



@Composable
fun MainScreen() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home"){

        namiPairingGraph(navController){
            navController.navigate("deviceDetail")
        }

        composable("home"){
            HomeScreen {
                navController.navigate("namipairing")
            }
        }

        composable("deviceDetail"){
            DeviceDetailScreen()
        }
    }
}