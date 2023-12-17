package com.andiraapps.instagramclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.andiraapps.instagramclone.compose.HomeScreen
import com.andiraapps.instagramclone.ui.theme.InstagramCloneTheme


val nameList : List<String> = listOf(
    "Udin","Suci","Rio","Shafwan"
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstagramCloneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen()
                }
            }
        }
    }

    @Composable
    fun NormalColumn(){
        Column(
            modifier = Modifier.verticalScroll(rememberScrollState())
        ) {
            repeat(1000){
                Text(text = "Ini Button")
                Button(onClick = {  }) {
                    Text(text = "CLICK")
                }
            }

        }
    }


    @Composable
    fun LazyColumnExample(){
        LazyColumn(){
            itemsIndexed(nameList){index,name ->
                Text(text = "${index +1}. $name")
            }
        }
    }


}


