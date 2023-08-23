package com.example.introductionjetpackcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.introductionjetpackcompose.ui.theme.IntroductionJetpackComposeTheme
import com.example.introductionjetpackcompose.ui.theme.azulButtonColors
import com.example.introductionjetpackcompose.ui.theme.rosaButtonColors
import com.example.introductionjetpackcompose.ui.theme.verdeButtonColors
import com.example.introductionjetpackcompose.ui.theme.vermeiomiles
import com.example.introductionjetpackcompose.ui.theme.vermelhoButtonColors
import androidx.compose.material3.ButtonColors as ButtonColors1
import androidx.compose.material3.ButtonColors as Material3ButtonColors

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IntroductionJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                app()
            }
        }
    }
}

const val TAG = "Teste Android"

@Composable
fun app(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
                    Greeting(name = "Jetpack")
                    ActionButton(
                        text = "Debug",
                        ButtonColors= vermelhoButtonColors(),
                        modifier = Modifier.fillMaxWidth(0.8f)
                        ){
                        Log.d(TAG, "App: Clicou em Debug!")
                    }

                    ActionButton(
                        text = "Info",
                        ButtonColors= azulButtonColors(),
                        modifier = Modifier.fillMaxWidth(0.8f)
                    ){
                        Log.i(TAG, "App: Clicou em Info!")
                    }

                    ActionButton(
                     text = "Warning",
                     ButtonColors= verdeButtonColors(),
                     modifier = Modifier.fillMaxWidth(0.8f)
                    ){
                        Log.w(TAG, "App: Clicou em Warning!")
                     }


                    ActionButton(
                        text = "Error",
                        ButtonColors= rosaButtonColors(),
                        modifier = Modifier.fillMaxWidth(0.8f)
                        ){
                        Log.e(TAG, "App: Clicou em Error!")
                    }

        }
       
    }
}

@Preview(showBackground = true, widthDp = 150, heightDp = 200)
@Composable
fun AppPreview(){
    IntroductionJetpackComposeTheme {
        app()
    }
}


@Composable
fun ActionButton(
    text: String,
    ButtonColors: ButtonColors = ButtonDefaults.buttonColors(),
    modifier: Modifier = Modifier,
    block: () -> Unit
){

    ElevatedButton(onClick = block,
                    shape = RoundedCornerShape(5.dp),
                    colors = ButtonColors,
                    modifier = modifier
        ) {
            Text(text = text)
    }


}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

