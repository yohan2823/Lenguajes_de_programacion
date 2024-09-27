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
fun JavaScriptScreen(navController: NavController) {
    val nextScreen = "mysql_screen"
    val previousScreen = "java_screen"

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF121212))
            .padding(16.dp),
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
                text = "JavaScript",
                style = MaterialTheme.typography.headlineMedium,
                color = Color(0xFFFFA500),
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(
                text = "JavaScript es un lenguaje esencial en el desarrollo web. Permite la creación de sitios interactivos y dinámicos, y se ejecuta en el lado del cliente (navegador). Es utilizado en conjunto con HTML y CSS para crear aplicaciones web modernas.",
                color = Color(0xFFFFA500),
                modifier = Modifier.padding(horizontal = 16.dp)
            )
        }
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .padding(16.dp),
            painter = painterResource(id = R.drawable.javascript),
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


