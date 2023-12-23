package com.andiraapps.instagramclone.compose

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.andiraapps.instagramclone.R
import com.andiraapps.instagramclone.ui.theme.InstagramCloneTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    logOut : ()-> Unit
) {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNavigation(
                backgroundColor = Color.White
            ) {
                BottomNavigationItem(selected = true, onClick = {
                    navController.navigate("home")
                }, icon = {
                    Image(painter = painterResource(id = R.drawable.ic_navigation_home), contentDescription = null)
                })
                BottomNavigationItem(selected = false, onClick = {
                    navController.navigate("search")
                }, icon = {
                    Image(painter = painterResource(id = R.drawable.ic_navigation_search), contentDescription = null)
                })
                BottomNavigationItem(selected = false, onClick = {
                    navController.navigate("reels")
                }, icon = {
                    Image(painter = painterResource(id = R.drawable.ic_navigation_reels), contentDescription = null)
                })
                BottomNavigationItem(selected = false, onClick = {
                    navController.navigate("shop")
                }, icon = {
                    Image(painter = painterResource(id = R.drawable.ic_navigation_shop), contentDescription = null)
                })
                BottomNavigationItem(selected = false, onClick = {
                    navController.navigate("profile")
                }, icon = {
                    Image(painter = painterResource(id = R.drawable.img_avatar1), contentDescription = null, modifier = Modifier.clip(CircleShape).width(20.dp).height(20.dp), contentScale = ContentScale.Crop
                    )
                })
            }
        }
    ) {
       NavHost(navController = navController, startDestination = "home"){
           composable("home"){
               HomeScreen()
           }
           composable("search"){
               SearchScreen()
           }
           composable("reels"){
               ReelsScreen()
           }
           composable("shop"){
               ShopScreen()
           }
           composable("profile"){
               ProfileScreen(logOut = logOut)
           }
       }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview(){
    InstagramCloneTheme {
        MainScreen(){}
    }
}