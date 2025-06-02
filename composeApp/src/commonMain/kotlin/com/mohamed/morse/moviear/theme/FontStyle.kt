package com.mohamed.morse.moviear.theme

import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import moviear.composeapp.generated.resources.Res
import moviear.composeapp.generated.resources.ubuntu_bold
import moviear.composeapp.generated.resources.ubuntu_medium
import moviear.composeapp.generated.resources.ubuntu_regular
import org.jetbrains.compose.resources.Font

@Composable
fun UbuntuFontFamily() = FontFamily(
    Font(
        resource = Res.font.ubuntu_bold,
        weight = FontWeight.Bold,
        style = FontStyle.Normal
    ),
    Font(
        resource = Res.font.ubuntu_medium,
        weight = FontWeight.Medium,
        style = FontStyle.Normal
    ),
    Font(
        resource = Res.font.ubuntu_regular,
        weight = FontWeight.Normal,
        style = FontStyle.Normal
    ),
)

@Composable
fun UbuntuTypography() = Typography().run {
    val fontFamily = UbuntuFontFamily()
    copy(
        h1 = h1.copy(fontFamily = fontFamily),
        h2 = h2.copy(fontFamily = fontFamily),
        h3 = h3.copy(fontFamily = fontFamily),
        h4 = h4.copy(fontFamily = fontFamily),
        h5 = h5.copy(fontFamily = fontFamily),
        h6 = h6.copy(fontFamily = fontFamily),
        body1 = body1.copy(fontFamily = fontFamily),
        body2 = body2.copy(fontFamily = fontFamily),
        subtitle1 = subtitle1.copy(fontFamily = fontFamily),
        subtitle2 = subtitle2.copy(fontFamily = fontFamily),
        button = button.copy(fontFamily = fontFamily),
        caption = caption.copy(fontFamily = fontFamily),
        overline = overline.copy(fontFamily = fontFamily)
    )
}