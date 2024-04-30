package com.example.textfield_cadastro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.textfield_cadastro.ui.theme.TextField_CadastroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextField_CadastroTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Register()
                }
            }
        }
    }
}

@Composable
fun Register() {
    var nome by remember { mutableStateOf("") }
    var Bairro by remember { mutableStateOf("") }
    var cep by remember { mutableStateOf("") }
    var cidade by remember { mutableStateOf("") }
    var Estado by remember { mutableStateOf("") }

    Column(Modifier
        .fillMaxWidth(),
    ) {
       Row(
           Modifier
               .fillMaxWidth(),
           Arrangement.Center
       ) {
           Text(text = "App Cadastro",
               fontSize = 20.sp
           )
       }

        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp)
        )
        Row(
            Modifier.fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(value = nome,
                onValueChange ={novoValor -> nome = novoValor},
                label = { Text(text = "Digite seu nome:")}
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            Modifier.fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(value = nome,
                onValueChange ={novoValor -> Bairro = novoValor},
                label = { Text(text = "Digite o nome do seu bairro:")}
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            Modifier.fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(value = nome,
                onValueChange ={novoValor -> cep = novoValor},
                label = { Text(text = "Digite seu nome:")}
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            Modifier.fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(value = nome,
                onValueChange ={novoValor -> cidade = novoValor},
                label = { Text(text = "Digite seu nome:")}
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            Modifier.fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(value = nome,
                onValueChange ={novoValor -> Estado = novoValor},
                label = { Text(text = "Digite o nome do seu Estado:")},
                shape = RoundedCornerShape(25.dp)
            )
        }
        
        Spacer(modifier = Modifier.height(16.dp))
        
        Row(
            Modifier.fillMaxWidth(),
            Arrangement.Center
        ){
            Button(onClick = {}) {
                Text(text = "Cadastrar")
                
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Register()
    }
}