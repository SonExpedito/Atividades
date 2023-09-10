package com.example.form_p5

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.form_p5.ui.theme.Form_P5Theme
import java.lang.Appendable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            form()
        }
    }
}

@Composable
fun form (){
    Form_P5Theme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            SimpleCenterAlignedTopAppBar()
        }
    }


}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SimpleCenterAlignedTopAppBar() {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = Color(0xFE, 0x0, 0x0, 0xFF)
                ),
                title = {
                    Text(
                        " Feedback",
                        style = TextStyle(
                            fontWeight = FontWeight.ExtraBold,
                            color = Color(1, 0, 0, 255),
                            fontSize = 30.sp
                        ),


                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(
                            imageVector = Icons.Filled.Menu,
                            contentDescription = "Localized description"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(
                            painter = painterResource(id = com.example.form_p5.R.drawable.zapzapp5),
                            contentDescription = "Localized description",
                            tint = Color.Unspecified,
                            modifier = Modifier.size(25.dp)


                            )
                    }
                },

                )

        }


        ,content = { innerPadding ->  ProjetoConfig() }

    )
}


@Preview
@Composable
fun PreviewApp(){
    form()
}




@Composable
fun ProjetoConfig(){
    Column(
        Modifier
            .background(color = Color(0, 0, 0, 255))
            .fillMaxSize())
    {
                Box(modifier = Modifier.height(80.dp))
                Row {
                    TituloForm()
                }


    }
}



@Composable
fun TituloForm(){
    Row {


        Box(
            contentAlignment = Alignment.Center
        ){
                    Image(painter = painterResource(id = R.drawable.detail), contentDescription ="Fundo" )
                    Text(text = "Suporte",style = androidx.compose.ui.text.TextStyle(
                        color = Color.White, fontSize = 36.sp,
                        fontWeight = FontWeight.Bold,
                        shadow = Shadow(
                            color = Color(254, 0, 0, 255),
                            offset = Offset(0f,9f),

                            )  ),



                    )


        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputsForm(){
    var texto by rememberSaveable { mutableStateOf("") }
    TextField(
        value = texto,
        onValueChange = { texto = it },
        label = { Text("Nome") },

    )


}