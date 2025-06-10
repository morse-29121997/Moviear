package com.mohamed.morse.moviear.screens.home.tabs

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.mohamed.morse.moviear.theme.Colors
import org.jetbrains.compose.ui.tooling.preview.Preview


@Preview
@Composable
fun ProfileContent (){
    Text(
        "Profile", color = Colors.FontColors.white, fontSize = 18.sp, modifier = Modifier
    )
}