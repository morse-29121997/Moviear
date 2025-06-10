package com.mohamed.morse.moviear.screens.home.tabs

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mohamed.morse.moviear.theme.Colors
import moviear.composeapp.generated.resources.Res
import moviear.composeapp.generated.resources.logo_icon
import moviear.composeapp.generated.resources.search_loupe
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun MoviesContent() {
    Box(Modifier.fillMaxSize().padding(vertical = 40.dp)){
        Box(
            modifier = Modifier.fillMaxWidth().height(80.dp).align(
                Alignment.TopCenter)
        ) {
            Image(
                painter = painterResource(resource = Res.drawable.logo_icon),
                contentDescription = null,
                modifier = Modifier.size(25.dp).align(
                    Alignment.Center
                )
            )
            Image(
                painter = painterResource(resource = Res.drawable.search_loupe),
                contentDescription = null,
                modifier = Modifier.padding(end = 10.dp).size(20.dp).align(
                    Alignment.CenterEnd
                )
            )
        }
        Text(
            "Movies", color = Colors.FontColors.white, fontSize = 18.sp, modifier = Modifier
                .align(Alignment.Center)
        )
    }
}