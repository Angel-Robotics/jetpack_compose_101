package com.dreamwalker.jetpack_compose_101.common

import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.height
import androidx.ui.layout.padding
import androidx.ui.material.Button
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
fun MyScreenContent(names: List<String> = listOf("Android", "Dreamwalker")) {
    Column {
        for (name in names) {
            Greeting(name = name)
            Divider(color = Color.Black, thickness = 2.dp)
        }
        Divider(color = Color.Yellow, modifier = Modifier.height(32.dp))
        Counter()
    }
}

@Composable
fun Counter() {
    val count = state { 0 }
    Button(onClick = { count.value++ }) {
        Text("I've been clicked ${count.value} times")
    }
}
