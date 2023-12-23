package com.andiraapps.instagramclone.compose

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.andiraapps.instagramclone.R
import com.andiraapps.instagramclone.ui.theme.InstagramCloneTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(goToMainScreen : ()-> Unit) {
    var usernameText by remember { mutableStateOf("") }
    var passwordText by remember { mutableStateOf("") }

    Scaffold() {
        Column(
            modifier = Modifier
                .padding(it)
                .padding(horizontal = 16.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.img_instagram_logo),
                contentDescription = null,
                modifier = Modifier
                    .width(100.dp)
                    .height(50.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            OutlinedTextField(value = usernameText, onValueChange = { text ->
                usernameText = text
            }, label = {
                Text(text = "Username")
            }, modifier = Modifier.fillMaxWidth(), placeholder = {
                Text(text = "Masukan Username")
            })
            Spacer(modifier = Modifier.height(10.dp))
            OutlinedTextField(value = passwordText, onValueChange = { text ->
                passwordText = text
            }, label = {
                Text(text = "Password")
            }, modifier = Modifier.fillMaxWidth(), placeholder = {
                Text(text = "Masukan Password")
            }, visualTransformation = PasswordVisualTransformation())
            Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = goToMainScreen, modifier = Modifier.fillMaxWidth()) {
                Text(text = "Log In")
            }
        }

    }
}


@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    InstagramCloneTheme {
        LoginScreen(){}
    }
}