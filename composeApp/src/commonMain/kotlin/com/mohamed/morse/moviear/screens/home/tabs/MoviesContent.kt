package com.mohamed.morse.moviear.screens.home.tabs

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalViewConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mohamed.morse.moviear.theme.Colors
import moviear.composeapp.generated.resources.Res
import moviear.composeapp.generated.resources.famous_bg
import moviear.composeapp.generated.resources.galaxy_test
import moviear.composeapp.generated.resources.language_icon
import moviear.composeapp.generated.resources.logo_icon
import moviear.composeapp.generated.resources.plus_bg
import moviear.composeapp.generated.resources.poster_test_poster
import moviear.composeapp.generated.resources.profile_icon
import moviear.composeapp.generated.resources.search_loupe
import moviear.composeapp.generated.resources.splas_bg
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.vectorResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun MoviesContent() {
    LazyColumn(Modifier.fillMaxSize().padding(vertical = 0.dp)) {

        item {
            Box(
                modifier = Modifier.fillMaxWidth().height(80.dp)
            ) {

                Image(
                    painter = painterResource(resource = Res.drawable.logo_icon),
                    contentDescription = null,
                    modifier = Modifier.size(17.dp, 24.dp).align(
                        Alignment.TopCenter
                    )
                )

                Image(
                    painter = painterResource(resource = Res.drawable.search_loupe),
                    contentDescription = null,
                    modifier = Modifier.padding(end = 10.dp).size(20.dp).align(
                        Alignment.TopEnd
                    )
                )

            }
        }

        item {
            LazyRow(modifier = Modifier.fillMaxWidth().height(160.dp)) {
                items(3) {
                    FamousMovieItem()
                }
            }
        }

        item {
            Box(modifier = Modifier.fillMaxWidth().padding(top = 20.dp)) {
                Text(
                    "In Theatres",
                    color = Colors.FontColors.white,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier.align(Alignment.TopStart)
                )

                Row(modifier = Modifier.align(Alignment.TopEnd)) {
                    Text(
                        "See All >",
                        color = Colors.FontColors.orange,
                        fontWeight = FontWeight.Normal,
                        fontSize = 16.sp,
                        modifier = Modifier
                    )
                }
            }
            LazyRow(modifier = Modifier.padding(top = 20.dp)) {
                items(20) {
                    GridItemVertical()
                }
            }
        }

        item {
            Box(modifier = Modifier.fillMaxWidth().padding(top = 20.dp)) {
                Text(
                    "On Demand",
                    color = Colors.FontColors.white,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier.align(Alignment.TopStart)
                )

                Row(modifier = Modifier.align(Alignment.TopEnd)) {
                    Text(
                        "See All >",
                        color = Colors.FontColors.orange,
                        fontWeight = FontWeight.Normal,
                        fontSize = 16.sp,
                        modifier = Modifier
                    )
                }
            }

            LazyRow(modifier = Modifier.padding(top = 20.dp)) {
                items(20) {
                    GridItemVertical()
                }
            }
        }
    }
}

@Composable
fun FamousMovieItem() {
    BoxWithConstraints(
        modifier = Modifier.padding(horizontal = 10.dp).width(340.dp).height(160.dp)
            .border(1.dp, Colors.FontColors.gray, RoundedCornerShape(5.dp))
    ) {
        Image(
            painter = painterResource(resource = Res.drawable.galaxy_test),
            contentDescription = null,
            modifier = Modifier.width(this.maxWidth).height(160.dp),
            contentScale = ContentScale.FillBounds
        )
        Image(
            painter = painterResource(resource = Res.drawable.famous_bg),
            contentDescription = null,
            modifier = Modifier.width(this.maxWidth).height(160.dp),
            contentScale = ContentScale.FillBounds
        )

        Text(
            "In Theater",
            color = Colors.FontColors.white,
            fontWeight = FontWeight.Normal,
            fontSize = 12.sp,
            modifier = Modifier.padding(10.dp)
                .background(Colors.FontColors.white.copy(alpha = 0.16F), RoundedCornerShape(5.dp))
                .padding(horizontal = 10.dp, vertical = (2.5).dp).align(Alignment.TopStart)
        )

        LanguagesCountView(modifier = Modifier.align(Alignment.BottomEnd).padding(10.dp))

        Row(
            modifier = Modifier.align(Alignment.BottomStart)
                .padding(horizontal = 10.dp, vertical = 10.dp)
        ) {
            Column(modifier = Modifier.weight(4F)) {

                Text(
                    "New Movie",
                    fontWeight = FontWeight.Medium,
                    color = Colors.FontColors.white.copy(alpha = 0.8f),
                    fontSize = 11.sp
                )

                Text(
                    "Guardians Of The Galaxy",
                    fontWeight = FontWeight.Bold,
                    color = Colors.FontColors.white,
                    fontSize = 16.sp
                )

            }
        }
    }
}

@Composable
fun LanguagesCountView(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.background(Colors.FontColors.orange, RoundedCornerShape(5.dp))
            .padding(horizontal = 5.dp, vertical = 5.dp)
    ) {
        Image(
            painter = painterResource(resource = Res.drawable.language_icon),
            contentDescription = null,
            modifier = Modifier.size(20.dp),
            contentScale = ContentScale.FillBounds
        )

        Text(
            "5 Languages",
            fontWeight = FontWeight.Medium,
            color = Colors.FontColors.white,
            modifier = Modifier.padding(horizontal = 10.dp),
            fontSize = 11.sp
        )
    }
}