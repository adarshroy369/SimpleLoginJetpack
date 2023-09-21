package com.example.loginappcompose.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text






import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.R
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Phone
import androidx.compose.runtime.Composable

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp




@Composable
fun InfoCard2(){
    BusinessCardMainApp()
}


@Composable
fun BusinessCardMainApp(){
    val image = painterResource(id =com.example.loginappcompose.R.drawable.photo)
    Column(horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize()
            .background(Color.DarkGray)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = image,
                contentDescription =null,
                modifier = Modifier
                    .width(500.dp)
                    .height(250.dp)
            )
            Spacer(modifier = Modifier.padding(0.dp))

            BusinessCardTitle(modifier= Modifier.padding(horizontal = 20.dp) ,name = stringResource(id = com.example.loginappcompose.R.string.name),
                title = stringResource(com.example.loginappcompose.R.string.IIITOngole) )
        }
    }
    Spacer(modifier = Modifier.padding(30.dp))
    Column(verticalArrangement = Arrangement.Center,modifier = Modifier
        .padding(top = 200.dp)
        .fillMaxSize()) {
        BusinessCardInformation(info = stringResource(id = com.example.loginappcompose.R.string.location), icon = Icons.Default.LocationOn)
        BusinessCardInformation(info = stringResource(id = com.example.loginappcompose.R.string.telephone_number), icon = Icons.Default.Phone)
        BusinessCardInformation(info = stringResource(id = com.example.loginappcompose.R.string.facebook), icon = Icons.Default.Create)
        BusinessCardInformation(info = stringResource(id = com.example.loginappcompose.R.string.email), icon = Icons.Filled.Email)
    }
}

@Composable
fun BusinessCardTitle(modifier: Modifier,name: String,title:String){
    Column(modifier= Modifier.padding(30.dp),horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text =name, fontSize = 32.sp, fontFamily = FontFamily.SansSerif, color = Color.White)
        Text(text = title, fontWeight = FontWeight.Bold, color = Color.Blue , modifier = Modifier.padding(top = 5.dp))
    }
}

@Composable
fun BusinessCardInformation(info:String,icon:ImageVector){
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 80.dp, top = 15.dp, bottom = 5.dp)) {
        Icon(imageVector = icon,
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier
                .padding(end = 10.dp))
        Text(text = info, color = Color.White )
    }
}



@Preview
@Composable
fun InfoCard2Preview(){
    BusinessCardMainApp()
}

