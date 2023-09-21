package com.example.loginappcompose.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetUpnavGraph(
    navController: NavHostController
){
    NavHost(navController = navController,
        startDestination = Screen.Login.route,
  ){
        composable(Screen.Login.route){
            LoginAppcompose(navController, url=String())
        }
        composable(Screen.First.route){
            InfoCard2()
        }
    }




}