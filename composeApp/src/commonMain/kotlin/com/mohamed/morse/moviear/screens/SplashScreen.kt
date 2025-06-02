package com.mohamed.morse.moviear.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.mohamed.morse.moviear.theme.Colors
import moviear.composeapp.generated.resources.Res
import moviear.composeapp.generated.resources.compose_multiplatform
import moviear.composeapp.generated.resources.moviear_logo
import moviear.composeapp.generated.resources.splas_bg
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun SplashScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(resource = Res.drawable.splas_bg),
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )

        Image(
            painter = painterResource(resource = Res.drawable.moviear_logo),
            contentDescription = null,
            modifier = Modifier.align(Alignment.Center).size(204.dp, 40.dp)
        )


        Text(
            text = "Your movies, your language",
            modifier = Modifier.align(Alignment.BottomCenter).padding(bottom = 40.dp) ,
            color = Colors.FontColors.white ,
            fontWeight = FontWeight.Medium
        )


    }
}