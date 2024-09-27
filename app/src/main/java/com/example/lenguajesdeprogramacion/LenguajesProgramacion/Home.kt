package com.example.lenguajesdeprogramacion.LenguajesProgramacion

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.lenguajesdeprogramacion.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    var expanded by remember { mutableStateOf(false) }
    var selectedLanguage by remember { mutableStateOf("Selecciona un lenguaje") }

    val languages = listOf("Kotlin", "Java", "JavaScript", "MySQL", "C++")
    val routes =
        listOf("kotlin_screen", "java_screen", "javascript_screen", "mysql_screen", "cpp_screen")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF121212)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
                .background(Color(0xFFFFA500))
        ) {
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(id = R.drawable.fondo),
                contentDescription = "Imagen de presentación"
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Bienvenido a la App de Informacion de Lenguajes de Programación",
            style = MaterialTheme.typography.headlineMedium,
            color = Color.White,
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Selecciona un lenguaje de programación para obtener más información.",
            style = MaterialTheme.typography.bodyLarge,
            color = Color.White,
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        ExposedDropdownMenuBox(
            expanded = expanded,
            onExpandedChange = { expanded = !expanded }
        ) {
            TextField(
                value = selectedLanguage,
                onValueChange = {},
                readOnly = true,
                label = { Text("Lenguajes de Programación", color = Color.White) },
                trailingIcon = {
                    ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded)
                },
                colors = TextFieldDefaults.colors(
                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.White,
                    focusedContainerColor = MaterialTheme.colorScheme.surface,
                    unfocusedContainerColor = MaterialTheme.colorScheme.surface,
                    focusedIndicatorColor = Color(0xFF00FFFF),
                    unfocusedIndicatorColor = Color.White
                ),
                modifier = Modifier
                    .menuAnchor()
                    .fillMaxWidth()
            )

            ExposedDropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                languages.forEachIndexed { index, language ->
                    DropdownMenuItem(
                        text = { Text(language, color = Color.White) },
                        onClick = {
                            selectedLanguage = language
                            expanded = false
                            navController.navigate(routes[index])
                        }
                    )
                }
            }
        }
        val nextScreen = "kotlin_screen"

        Spacer(modifier = Modifier.height(32.dp))
        Button(
            onClick = { navController.navigate(nextScreen) },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow)
        ) {
            Text("Siguiente", color = Color.Black)
        }
    }


}