package com.example.lenguajesdeprogramacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.lenguajesdeprogramacion.LenguajesProgramacion.navigation.NavigationApp
import com.example.lenguajesdeprogramacion.ui.theme.MyAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppTheme(darkTheme = true) {
                NavigationApp()
            }
        }
    }
}

