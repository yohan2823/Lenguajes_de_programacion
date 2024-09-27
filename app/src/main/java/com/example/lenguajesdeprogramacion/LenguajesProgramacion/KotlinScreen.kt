package com.example.lenguajesdeprogramacion.LenguajesProgramacion.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.lenguajesdeprogramacion.R

@Composable
fun KotlinScreen(navController: NavController) {
    val nextScreen = "java_screen"
    val previousScreen = "home_screen"

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF121212)),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Kotlin",
                style = MaterialTheme.typography.headlineMedium,
                color = Color(0xFF800080),
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(
                text = "Kotlin es un lenguaje moderno diseñado para la interoperabilidad con Java. Es el lenguaje preferido para el desarrollo de aplicaciones Android.",
                color = Color(0xFF800080),
                modifier = Modifier.padding(horizontal = 16.dp)
            )
        }
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .padding(16.dp),
            painter = painterResource(id = R.drawable.kotlin),
            contentDescription = "Imagen de presentación"
        )
        Spacer(modifier = Modifier.weight(1f))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = { navController.navigate(previousScreen) },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow)
            ) {
                Text("Atrás", color = Color.Black)
            }
            Button(
                onClick = { navController.navigate("home_screen") },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow)
            ) {
                Text("Volver al Inicio", color = Color.Black)
            }
            Button(
                onClick = { navController.navigate(nextScreen) },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow)
            ) {
                Text("Siguiente", color = Color.Black)
            }
        }
    }
}
