package com.mohamed.morse.moviear.screens.home.tabs

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmapConfig
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mohamed.morse.moviear.theme.Colors
import moviear.composeapp.generated.resources.Res
import moviear.composeapp.generated.resources.download
import moviear.composeapp.generated.resources.downloads_icon
import moviear.composeapp.generated.resources.logo_icon
import moviear.composeapp.generated.resources.poster_test_poster
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun DownloadsContent() {

    Column(
        modifier = Modifier.fillMaxSize().padding(horizontal = 15.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(resource = Res.drawable.logo_icon),
            contentDescription = null,
            modifier = Modifier.padding(top = 0.dp).size(17.dp, 24.dp),
            contentScale = ContentScale.FillBounds
        )
        Text(
            "Downloads",
            color = Colors.FontColors.white,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            modifier = Modifier.fillMaxWidth().padding(top = 20.dp)
        )
        Text(
            "Only movies playing at theaters require download to sync appropriately. We recommend downloading wherever you get strong signal.",
            color = Colors.FontColors.gray,
            fontWeight = FontWeight.Normal,
            fontSize = 12.sp,
            lineHeight = 15.sp,
            modifier = Modifier.fillMaxWidth().padding(top = 10.dp)
        )

        LazyColumn(modifier = Modifier.fillMaxSize().padding(top = 20.dp)) {
            items(10) {
                ListItemRow()
            }
        }


    }
}

@Composable
fun ListItemRow() {
    Row(
        modifier = Modifier.padding(vertical = 5.dp).fillMaxWidth().height(130.dp).background(
            Colors.FontColors.lightBlack,
            RoundedCornerShape(10.dp)
        ),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
    ) {
        Box(Modifier.padding(horizontal = 10.dp).size(72.dp, 106.dp)) {
            Image(
                painter = painterResource(resource = Res.drawable.poster_test_poster),
                contentDescription = null,
                modifier = Modifier.size(72.dp, 106.dp),
                contentScale = ContentScale.FillBounds
            )
            Text(
                "日本",
                color = Colors.FontColors.white,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp,
                modifier = Modifier.background(Colors.FontColors.gray , RoundedCornerShape(5.dp)).padding(horizontal = 5.dp , vertical = (2.5).dp).align(Alignment.Center)
            )
        }

        Column {
            Text(
                "Spider-MAN: Into The Spider-Verse",
                color = Colors.FontColors.white,
                fontWeight = FontWeight.Bold,
                overflow = TextOverflow.Ellipsis,
                maxLines = 2,
                fontSize = 14.sp,
                modifier = Modifier.padding(horizontal = 10.dp ).padding(top = 10.dp).fillMaxWidth(0.8f)
            )
            Text(
                "AMC Inglewood 10 \n Tue 5:30pm",
                color = Colors.FontColors.gray,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp,
                modifier = Modifier.padding(horizontal = 10.dp ).padding(top = 5.dp)
            )
        }

        Image(
            painter = painterResource(resource = Res.drawable.download),
            contentDescription = null,
            modifier = Modifier.size(30.dp),
            contentScale = ContentScale.FillBounds
        )

    }
}