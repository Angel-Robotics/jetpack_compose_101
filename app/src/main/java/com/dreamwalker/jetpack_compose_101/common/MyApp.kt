package com.dreamwalker.jetpack_compose_101.common

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.padding
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Surface
import androidx.ui.unit.dp

@Composable
fun MyApp(content: @Composable() () -> Unit) {
    MaterialTheme() {
        content()
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!", modifier = Modifier.padding(24.dp))
}

@Composable
fun MyScreenContent(names:List<String> = listOf("Android", "Dreamwalker")) {
    Column {
        for(name in names){
            Greeting(name = name)
            Divider(color = Color.Black, thickness = 2.dp)
        }
    }
}

