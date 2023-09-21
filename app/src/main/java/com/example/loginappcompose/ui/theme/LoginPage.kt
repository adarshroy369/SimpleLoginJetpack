package com.example.loginappcompose.ui.theme

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.R
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.NavHostController
import com.example.loginappcompose.navController


@Composable
fun LoginAppcompose(navController:NavHostController,url: String){
    val context = LocalContext.current




    var email by remember {
        mutableStateOf(" ")
    }

    var password by remember {
        mutableStateOf("")

    }


    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "LOGIN PAGE",
            fontFamily = FontFamily.Cursive,
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Blue,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 30.dp)


        )

        OutlinedTextField(value = email, onValueChange =  {email=it  },
            label={ Text("enter your email") },
            leadingIcon = {
                Icon(Icons.Default.Person, contentDescription = "person")
            },

            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp, top = 10.dp)
        )




        OutlinedTextField(value = password, onValueChange =  {password=it  },
            label={ Text("enter your password") },
            leadingIcon = {
                Icon(Icons.Default.Info, contentDescription = "password")
            },

            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp, top = 10.dp),

            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)

        )

        OutlinedButton(onClick = {
            navController.navigate(route = Screen.First.route)
        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp, top = 10.dp)) {
            Text(text = "Login",
                textAlign = TextAlign.Center)
        }



        Text(modifier= Modifier.padding(top = 40.dp),
            text = "or Connect with",
            fontWeight = FontWeight.Medium, color = Color.Gray)



        Row(modifier= Modifier
            .fillMaxWidth()
            .padding(top = 10.dp), horizontalArrangement = Arrangement.Center) {


            IconButton(onClick = {

                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
                context.startActivity(intent)

            }){


                Icon(modifier = Modifier.size(50.dp),
                    painter = painterResource(id = com.example.loginappcompose.R.drawable.gmail1)
                    , contentDescription = "googleicon", tint = Color.Unspecified)

            }


            }

            Spacer(modifier = Modifier.width(20.dp))
            IconButton(onClick = {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/login.php"))
                context.startActivity(intent)

            }) {
                Icon(
                    modifier= Modifier.size(52.dp),
                    painter = painterResource(id = com.example.loginappcompose.R.drawable.fb),
                    contentDescription ="facebook", tint = Color.Unspecified )




            }

        }

    }









//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun LoginAppcomposePreview() {
//LoginAppcompose()
//}