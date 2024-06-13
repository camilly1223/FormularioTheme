package com.example.formulario

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.formulariotheme.ui.theme.FormularioThemeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FormularioThemeTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.primaryContainer
                ) {

                }
            }
        }
    }
}

@Composable
fun App(){
    var nome by remember { mutableStateOf("") }
    Column (
        Modifier

            .background(Color.Companion.White)
            .fillMaxWidth()
    ) {
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){
            Text(
                text = "App Formulario",
                fontFamily = FontFamily.Cursive,
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Row (
            Modifier
                .fillMaxWidth()

        ){

        }
        Row (
            Modifier
                .fillMaxWidth()
                .padding(50.dp, 30.dp, 0.dp, 0.dp)
        ){
            TextField(
                value = nome,
                onValueChange = {nome = it},
                label = {Text(text = "Nome")}
            )
        }
        Row (
            Modifier
                .fillMaxWidth()
                .padding(50.dp, 20.dp, 0.dp, 0.dp)
        ) {
            TextField(
                value = nome,
                onValueChange = {nome = it},
                label = {Text(text = "RG")}
            )
        }
        Row (
            Modifier
                .fillMaxWidth()
                .padding(50.dp, 20.dp, 0.dp, 0.dp)
        ) {
            TextField(
                value = nome,
                onValueChange = {nome = it},
                label = {Text(text = "Cpf")}
            )
        }
        Row (
            Modifier
                .fillMaxWidth()
                .padding(50.dp, 20.dp, 0.dp, 0.dp)
        ) {
            TextField(
                value = nome,
                onValueChange = {nome = it},
                label = {Text(text = "Cep")}
            )
        }
        Row (
            Modifier
                .fillMaxWidth()
                .padding(50.dp, 20.dp, 0.dp, 0.dp)
        ) {
            TextField(
                value = nome,
                onValueChange = {nome = it},
                label = {Text(text = "Genero")}
            )
        }
        Row (
            Modifier
                .fillMaxWidth()
                .padding(50.dp, 20.dp, 0.dp, 0.dp)
        ) {
            TextField(
                value = nome,
                onValueChange = {nome = it},
                label = {Text(text = "Endereço")}
            )
        }
        Row (
            Modifier
                .fillMaxWidth()
                .padding(50.dp, 20.dp, 0.dp, 0.dp)
        ) {
            TextField(
                value = nome,
                onValueChange = {nome = it},
                label = {Text(text = "Telefone")}
            )
        }
        Row (
            Modifier
                .fillMaxWidth()
                .padding(50.dp, 20.dp, 0.dp, 0.dp)
        ) {
            TextField(
                value = nome,
                onValueChange = {nome = it},
                label = {Text(text = "Data de nascimento")}
            )
        }
        Row (
            Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
        }
        Row (
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            Button(
                onClick = { /*TODO*/ }
            ) {
                Text(text = "Cadastrar")
            }
        }
    }
}
@Preview
@Composable
fun AppPreview() {
    FormularioThemeTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.primaryContainer
        ) {
            App()
        }
    }
}