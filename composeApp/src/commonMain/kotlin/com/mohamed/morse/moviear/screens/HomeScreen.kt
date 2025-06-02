package com.mohamed.morse.moviear.screens

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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mohamed.morse.moviear.theme.Colors
import moviear.composeapp.generated.resources.Res
import moviear.composeapp.generated.resources.downloads_icon
import moviear.composeapp.generated.resources.home_icon
import moviear.composeapp.generated.resources.logo_icon
import moviear.composeapp.generated.resources.plus_icon
import moviear.composeapp.generated.resources.profile_icon
import moviear.composeapp.generated.resources.search_loupe
import moviear.composeapp.generated.resources.splas_bg
import moviear.composeapp.generated.resources.watch_list_icon
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.imageResource
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.vectorResource
import org.jetbrains.compose.ui.tooling.preview.Preview

enum class Destinations {
    Home , Plus , Downloads , Profile , Watchlist
}

@Preview
@Composable
fun HomeScreen() {
    val destinations : MutableState<Destinations> = mutableStateOf(Destinations.Home)
    Box(modifier = Modifier.fillMaxSize().background(Colors.FontColors.black)) {
        Box(
            modifier = Modifier.fillMaxWidth().height(80.dp).padding(top = 40.dp)
                .align(Alignment.TopCenter)

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
        BottomNavigation(
            modifier = Modifier.align(Alignment.BottomCenter).padding(bottom = 20.dp),
            backgroundColor = Colors.FontColors.black
        ) {
            Row {
                BottomNavigationItem(Res.drawable.home_icon , "Home" , destinations.value == Destinations.Home){destinations.value = Destinations.Home}
                Spacer(Modifier.width(15.dp))
                BottomNavigationItem(Res.drawable.watch_list_icon , "Watchlist" , destinations.value == Destinations.Watchlist){destinations.value = Destinations.Watchlist}
                Spacer(Modifier.width(15.dp))
                BottomNavigationItem(Res.drawable.downloads_icon , "Downloads" , destinations.value == Destinations.Downloads){destinations.value = Destinations.Downloads}
                Spacer(Modifier.width(15.dp))
                BottomNavigationItem(Res.drawable.plus_icon , "Plus" , destinations.value == Destinations.Plus){destinations.value = Destinations.Plus}
                Spacer(Modifier.width(15.dp))
                BottomNavigationItem(Res.drawable.profile_icon , "Profile" , destinations.value == Destinations.Profile){destinations.value = Destinations.Profile}
            }
        }
    }
}

@Composable
fun BottomNavigationItem(icon: DrawableResource, name: String, isSelected: Boolean = false , onClick : () -> Unit = {}) {
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
            color = if (isSelected) Colors.FontColors.white else Colors.FontColors.white.copy(alpha = 0.5f) ,
            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal ,
            fontSize = if (isSelected) 13.sp else 12.sp
        )
    }
}