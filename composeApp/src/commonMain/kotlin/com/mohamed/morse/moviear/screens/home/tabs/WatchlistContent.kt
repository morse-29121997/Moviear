package com.mohamed.morse.moviear.screens.home.tabs

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mohamed.morse.moviear.theme.Colors
import moviear.composeapp.generated.resources.Res
import moviear.composeapp.generated.resources.grid_icon
import moviear.composeapp.generated.resources.linear_icon
import moviear.composeapp.generated.resources.logo_icon
import moviear.composeapp.generated.resources.poster_test_poster
import moviear.composeapp.generated.resources.search_loupe
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview


@Preview
@Composable
fun WatchlistContent() {
    val nestedScrollConnection = remember {
        object : NestedScrollConnection {
            override fun onPreScroll(available: Offset, source: NestedScrollSource): Offset {
                // Called before the child consumes the scroll.
                // 'available' is the delta proposed by the pointer input.
                // We consume some (or all) of the scroll delta if the header is moving.
                // If headerOffsetPx changed, it means we consumed something.
                // Return the amount of scroll we consumed.
                return Offset.Zero // Default, let child scroll. For this example, let's make it more obvious
                // by consuming if we are moving the header.
                // A more sophisticated example would only consume if the header *can* move.
            }

            override fun onPostScroll(
                consumed: Offset,          // How much the child consumed
                available: Offset,         // How much was left after the child consumed
                source: NestedScrollSource
            ): Offset {
                // Called after the child has consumed the scroll.
                // Useful if you want to react to leftover scroll delta.
                // For this example, we handle most of it in onPreScroll.
                return Offset.Zero
            }
        }
    }
    Column(
        modifier = Modifier.fillMaxSize().nestedScroll(nestedScrollConnection)
            .padding(horizontal = 15.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier.padding(top = 40.dp).fillMaxWidth().height(80.dp)
        ) {
            Image(
                painter = painterResource(resource = Res.drawable.logo_icon),
                contentDescription = null,
                modifier = Modifier.size(17.dp, 24.dp).align(
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

        Box(modifier = Modifier.fillMaxWidth().padding(top = 10.dp)) {
            Text(
                "Your Watch-List 🔥",
                color = Colors.FontColors.white,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                modifier = Modifier.align(Alignment.CenterStart)
            )
            ListPreviewController(Modifier.align(Alignment.CenterEnd))
        }
        MoviesSection(
            arrayListOf(
                "1",
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
                "8",
                "9",
                "10",
                "11",
                "12",
                "13",
                "14",
                "15"
            )
        )
        SeriesSection(
            arrayListOf(
                "1",
                "2",
                "4",
                "4",
                "5",
                "6",
                "7",
                "8",
                "9",
                "10",
                "11",
                "12",
                "13",
                "14",
                "15"
            )
        )

    }
}

@Composable
fun MoviesSection(list: List<String?>) {
    if (list.isNotEmpty()) {
        Column(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp)) {
            Text(
                "Movies 🎬",
                color = Colors.FontColors.white,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
            )
            LazyHorizontalGrid(
                rows = GridCells.Fixed(2),
                modifier = Modifier.fillMaxWidth().height(320.dp).padding(top = 10.dp) , contentPadding = PaddingValues(10.dp)
            ) {
                items(list) {
                    GridItemVertical()
                }
            }

        }
    }
}

@Composable
fun SeriesSection(list: List<String?>) {
    if (list.isNotEmpty()) {
        Column(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp)) {
            Text(
                "Series 🍿",
                color = Colors.FontColors.white,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
            )
            LazyHorizontalGrid(
                rows = GridCells.Fixed(2),
                modifier = Modifier.fillMaxWidth().height(320.dp).padding(top = 10.dp) , contentPadding = PaddingValues(10.dp)
            ) {
                items(list) {
                    GridItemVertical()
                }
            }
        }
    }
}


@Composable
fun ListPreviewController(modifier: Modifier = Modifier) {

    Box(
        modifier = modifier.size(85.dp, 50.dp)
            .background(Colors.FontColors.black, RoundedCornerShape(30.dp))
            .border(1.dp, Colors.FontColors.white.copy(alpha = 0.16F), RoundedCornerShape(30.dp))
            .padding(horizontal = 5.dp),
    ) {

        Box(
            modifier = Modifier.size(35.dp)
                .background(Colors.FontColors.orange, shape = CircleShape)
                .align(Alignment.CenterEnd)
        )

        Image(
            painter = painterResource(Res.drawable.linear_icon),
            contentDescription = null,
            modifier = Modifier.padding(start = 10.dp).size(15.dp).align(Alignment.CenterStart),
            contentScale = ContentScale.Crop
        )

        Image(
            painter = painterResource(Res.drawable.grid_icon),
            contentDescription = null,
            modifier = Modifier.padding(end = 10.dp).size(15.dp).align(Alignment.CenterEnd),
            contentScale = ContentScale.Crop
        )

    }

}

@Composable
fun GridItemVertical() {
    Column(modifier = Modifier.height(160.dp).padding(5.dp)) {
        Box {
            Image(
                painter = painterResource(Res.drawable.poster_test_poster),
                contentDescription = null,
                modifier = Modifier.size(80.dp, 140.dp),
                contentScale = ContentScale.FillBounds
            )
        }
    }
}