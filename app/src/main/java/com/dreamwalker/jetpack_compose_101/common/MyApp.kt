package com.dreamwalker.jetpack_compose_101.common

import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxHeight
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
fun MyScreenContent(names: List<String> = listOf("Android", "there")) {
    val counterState = state { 0 }

    Column(modifier = Modifier.fillMaxHeight().padding(16.dp)) {

        Column(modifier = Modifier.weight(1f)) {

            for (name in names) {
                Greeting(name = name)
                Divider(color = Color.Black)
            }
            Divider(color = Color.Transparent, modifier = Modifier.height(16.dp))

        }

        Counter(
                count = counterState.value,
                updateCount = { newCount ->
                    counterState.value = newCount
                }
        )
    }

}

@Composable
fun Counter(count: Int, updateCount: (Int) -> Unit) {
    Button(onClick = { updateCount(count + 1) }) {
        Text("I've been clicked $count times")
    }
}