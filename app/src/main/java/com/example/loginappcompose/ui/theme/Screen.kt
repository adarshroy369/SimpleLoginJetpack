package com.example.loginappcompose.ui.theme

 sealed class Screen(val route:String) {
    object Login:Screen(route = "LoginPage")
     object First:Screen(route = "FirstScreen")
}