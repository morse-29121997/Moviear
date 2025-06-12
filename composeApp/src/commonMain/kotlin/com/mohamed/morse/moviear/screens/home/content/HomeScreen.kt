package com.mohamed.morse.moviear.screens.home.content

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.BottomNavigation
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mohamed.morse.moviear.screens.home.tabs.DownloadsContent
import com.mohamed.morse.moviear.screens.home.tabs.MoviesContent
import com.mohamed.morse.moviear.screens.home.tabs.PlusContent
import com.mohamed.morse.moviear.screens.home.tabs.ProfileContent
import com.mohamed.morse.moviear.screens.home.tabs.WatchlistContent
import com.mohamed.morse.moviear.theme.Colors
import moviear.composeapp.generated.resources.Res
import moviear.composeapp.generated.resources.downloads_icon
import moviear.composeapp.generated.resources.home_icon
import moviear.composeapp.generated.resources.logo_icon
import moviear.composeapp.generated.resources.plus_icon
import moviear.composeapp.generated.resources.profile_icon
import moviear.composeapp.generated.resources.search_loupe
import moviear.composeapp.generated.resources.watch_list_icon
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.vectorResource
import org.jetbrains.compose.ui.tooling.preview.Preview

enum class Destinations {
    Home,
    Plus,
    Downloads,
    Profile,
    Watchlist
}

@Preview
@Composable
fun HomeScreen() {
    var destinations: Destinations by remember { mutableStateOf(Destinations.Profile) }
    Box(modifier = Modifier.fillMaxSize().background(Colors.FontColors.black)) {
        when (destinations) {
            Destinations.Home -> MoviesContent()
            Destinations.Plus -> PlusContent()
            Destinations.Profile -> ProfileContent()
            Destinations.Downloads -> DownloadsContent()
            Destinations.Watchlist -> WatchlistContent()
        }
        BottomNavigation(
            modifier = Modifier.align(Alignment.BottomCenter),
            backgroundColor = Colors.FontColors.black
        ) {
            Row(modifier = Modifier.padding(bottom = 20.dp)) {
                BottomNavigationItem(
                    Res.drawable.home_icon,
                    "Home",
                    destinations == Destinations.Home
                ) {
                    destinations = Destinations.Home
                }
                Spacer(Modifier.width(15.dp))
                BottomNavigationItem(
                    Res.drawable.watch_list_icon,
                    "Watchlist",
                    destinations == Destinations.Watchlist
                ) {
                    destinations = Destinations.Watchlist
                }
                Spacer(Modifier.width(15.dp))
                BottomNavigationItem(
                    Res.drawable.downloads_icon,
                    "Downloads",
                    destinations == Destinations.Downloads
                ) {
                    destinations = Destinations.Downloads
                }
                Spacer(Modifier.width(15.dp))
                BottomNavigationItem(
                    Res.drawable.plus_icon,
                    "Plus",
                    destinations == Destinations.Plus
                ) {
                    destinations = Destinations.Plus
                }
                Spacer(Modifier.width(15.dp))
                BottomNavigationItem(
                    Res.drawable.profile_icon,
                    "Profile",
                    destinations == Destinations.Profile
                ) {
                    destinations = Destinations.Profile
                }
            }
        }


    }
}

@Composable
fun BottomNavigationItem(
    icon: DrawableResource,
    name: String,
    isSelected: Boolean = false,
    onClick: () -> Unit = {}
) {
    Column(
        modifier = Modifier.padding(10.dp).defaultMinSize(minWidth = 25.dp).clickable { onClick() },
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Icon(
            imageVector = vectorResource(icon),
            contentDescription = null,
            tint = if (isSelected) Colors.FontColors.white else Colors.FontColors.white.copy(alpha = 0.5f)
        )
        Spacer(Modifier.height(10.dp))
        Text(
            text = name,
            color = if (isSelected) Colors.FontColors.white else Colors.FontColors.white.copy(alpha = 0.5f),
            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
            fontSize = if (isSelected) 13.sp else 12.sp
        )
    }
}