package com.example.lenguajesdeprogramacion.LenguajesProgramacion.screens

import android.annotation.SuppressLint
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

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun JavaScreen(navController: NavController) {
    val nextScreen = "javascript_screen"
    val previousScreen = "kotlin_screen"

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
                text = "Java",
                style = MaterialTheme.typography.headlineMedium,
                color = Color(0xFF800020),
                modifier = Modifier.padding(bottom = 8.dp)
            )

            Text(
                text = "Java es uno de los lenguajes de programación más utilizados en el mundo, especialmente para aplicaciones empresariales y móviles.",
                color = Color(0xFF800020),
                modifier = Modifier.padding(horizontal = 16.dp)
            )
        }
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .padding(16.dp),
            painter = painterResource(id = R.drawable.java),
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
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF00FFFF))
            ) {
                Text("Atrás", color = Color.Black)
            }

            Button(
                onClick = { navController.navigate("home_screen") },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF00FFFF))
            ) {
                Text("Volver al Inicio", color = Color.Black)
            }

            Button(
                onClick = { navController.navigate(nextScreen) },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF00FFFF))
            ) {
                Text("Siguiente", color = Color.Black)
            }
        }
    }
}


