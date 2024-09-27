package com.example.lenguajesdeprogramacion.LenguajesProgramacion.navigation

import com.example.lenguajesdeprogramacion.LenguajesProgramacion.HomeScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lenguajesdeprogramacion.LenguajesProgramacion.screens.CppScreen
import com.example.lenguajesdeprogramacion.LenguajesProgramacion.screens.JavaScreen
import com.example.lenguajesdeprogramacion.LenguajesProgramacion.screens.JavaScriptScreen
import com.example.lenguajesdeprogramacion.LenguajesProgramacion.screens.KotlinScreen
import com.example.lenguajesdeprogramacion.LenguajesProgramacion.screens.MySQLScreen


@Composable
fun NavigationApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home_screen") {
        composable("home_screen") {
            HomeScreen(navController)
        }
        composable("kotlin_screen") {
            KotlinScreen(navController)
        }
        composable("java_screen") {
            JavaScreen(navController)
        }
        composable("javascript_screen") {
            JavaScriptScreen(navController)
        }
        composable("mysql_screen") {
            MySQLScreen(navController)
        }
        composable("cpp_screen") {
            CppScreen(navController)
        }
    }
}





