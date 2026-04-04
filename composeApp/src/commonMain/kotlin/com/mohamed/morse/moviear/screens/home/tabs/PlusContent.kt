package com.mohamed.morse.moviear.screens.home.tabs

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mohamed.morse.moviear.theme.Colors
import moviear.composeapp.generated.resources.Res
import moviear.composeapp.generated.resources.checked_icon
import moviear.composeapp.generated.resources.moviear_plus_logo
import moviear.composeapp.generated.resources.moviear_plus_neon_bg
import moviear.composeapp.generated.resources.plus_bg
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun PlusContent() {
    Box(modifier = Modifier.fillMaxSize().padding(bottom = 100.dp)) {
        Image(
            painter = painterResource(resource = Res.drawable.plus_bg),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(resource = Res.drawable.moviear_plus_logo),
                contentDescription = null,
                modifier = Modifier.padding(top = 100.dp).size(150.dp, 30.dp),
                contentScale = ContentScale.FillBounds
            )
            Text(
                "Enjoy the moviear plus experience",
                color = Colors.FontColors.white,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                modifier = Modifier.padding(top = 20.dp)
            )

            TermsBox()

            Button(
                onClick = {},
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Colors.FontColors.white),
                modifier = Modifier.fillMaxWidth().padding(top = 20.dp).height(60.dp)
                    .padding(horizontal = 40.dp)
            ) {
                Text(
                    text = buildAnnotatedString {
                        append("Subscribe")
                        withStyle(
                            style = SpanStyle(
                                color = Colors.FontColors.orange,
                                fontWeight = FontWeight.ExtraBold
                            )
                        ) {
                            append(" \$3.99")
                        }
                        append("/mo")
                    },
                    color = Colors.FontColors.black,
                    fontSize = 14.sp,
                )
            }

            Text(
                "Or save with an annual subscription",
                color = Colors.FontColors.gray,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp,
                modifier = Modifier.padding(top = 20.dp)
            )

            Button(
                onClick = {},
                border = BorderStroke(2.dp, Colors.FontColors.white),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Colors.FontColors.black),
                modifier = Modifier.fillMaxWidth().padding(top = 20.dp).height(60.dp)
                    .padding(horizontal = 40.dp)
            ) {
                Text(
                    text = buildAnnotatedString {
                        append("Subscribe")
                        withStyle(
                            style = SpanStyle(
                                color = Colors.FontColors.orange,
                                fontWeight = FontWeight.ExtraBold
                            )
                        ) {
                            append(" \$39")
                        }
                        append("/yr")
                    },
                    color = Colors.FontColors.white,
                    fontSize = 14.sp,
                )
            }

            Text(
                "Restore purchase",
                color = Colors.FontColors.blue,
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp,
                modifier = Modifier.padding(top = 20.dp)
            )
        }

    }
}

@Composable
fun TermsBox() {
    Box(modifier = Modifier.padding(top = 20.dp).size(302.dp, 236.dp)) {
        Image(
            painter = painterResource(resource = Res.drawable.moviear_plus_neon_bg),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
        LazyColumn(
            modifier = Modifier.align(Alignment.Center).fillMaxWidth().padding(start = 40.dp)
        ) {
            items(
                arrayListOf<String>(
                    "No Ads",
                    "User Perks",
                    "Spatial Audio",
                    "Cancel Anytime"
                )
            ) {
                Row(modifier = Modifier) {
                    Image(
                        painter = painterResource(resource = Res.drawable.checked_icon),
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier.size(30.dp, 30.dp).align(Alignment.CenterVertically)
                    )
                    Spacer(Modifier.width(5.dp))
                    Text(
                        text = it,
                        color = Colors.FontColors.white,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}