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
fun MySQLScreen(navController: NavController) {
    val nextScreen = "cpp_screen"
    val previousScreen = "javascript_screen"

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
                text = "MySQL",
                style = MaterialTheme.typography.headlineMedium,
                color = Color(0xFFADD8E6),
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(
                text = "MySQL es un sistema de gestión de bases de datos relacional de código abierto. Es ampliamente utilizado para almacenar, gestionar y consultar datos en aplicaciones web, y es conocido por su eficiencia y facilidad de uso. MySQL forma parte fundamental del stack LAMP (Linux, Apache, MySQL, PHP/Python/Perl).",
                color = Color(0xFFADD8E6),
                modifier = Modifier.padding(horizontal = 16.dp)
            )
        }
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .padding(16.dp),
            painter = painterResource(id = R.drawable.mysql),
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
                colors = ButtonDefaults.buttonColors(containerColor = Color.Cyan)
            ) {
                Text("Atrás", color = Color.Black)
            }
            Button(
                onClick = { navController.navigate("home_screen") },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Cyan)
            ) {
                Text("Volver al Inicio", color = Color.Black)
            }
            Button(
                onClick = { navController.navigate(nextScreen) },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Cyan)
            ) {
                Text("Siguiente", color = Color.Black)
            }
        }
    }
}

