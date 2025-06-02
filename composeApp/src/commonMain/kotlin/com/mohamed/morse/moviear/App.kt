package com.mohamed.morse.moviear

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import com.mohamed.morse.moviear.screens.home.content.HomeScreen
import com.mohamed.morse.moviear.theme.UbuntuTypography
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme(typography = UbuntuTypography()) {
        HomeScreen()
    }
}