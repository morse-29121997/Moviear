package com.mohamed.morse.moviear.screens.home.tabs

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mohamed.morse.moviear.theme.Colors
import org.jetbrains.compose.ui.tooling.preview.Preview


@Preview
@Composable
fun ProfileContent (modifier: Modifier = Modifier){
    Text(
        "Profile", color = Colors.FontColors.white, fontSize = 18.sp, modifier = modifier
    )
}