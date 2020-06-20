package com.dreamwalker.jetpack_compose_101

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.Arrangement
import androidx.ui.material.Card
import androidx.ui.material.Surface
import androidx.ui.tooling.preview.Preview
import com.dreamwalker.jetpack_compose_101.common.MyApp
import com.dreamwalker.jetpack_compose_101.common.MyScreenContent
import com.dreamwalker.jetpack_compose_101.ui.Jetpack_Compose_101Theme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp{
                MyScreenContent()
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Surface(color = Color.Yellow) {
        Text(text = "Hello $name!")
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Jetpack_Compose_101Theme {
        Greeting("Android")
    }
}

@Composable
fun MyCustomCard(){
    Card() {

    }
    
}
@Preview(showBackground = true)
@Composable
fun CardUI() {
    MyCustomCard()
}








