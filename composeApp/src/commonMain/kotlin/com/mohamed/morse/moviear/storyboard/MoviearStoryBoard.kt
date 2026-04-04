package com.mohamed.morse.moviear.storyboard

import androidx.compose.runtime.Composable
import com.mohamed.morse.moviear.screens.home.content.Destinations
import com.mohamed.morse.moviear.screens.home.content.HomeScreen
import com.mohamed.morse.moviear.screens.splash.SplashScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun Splash() {
    SplashScreen()
}

@Composable
@Preview
fun HomeMoviesContent() {
    HomeScreen(Destinations.Home)
}

@Composable
@Preview
fun HomeWatchListContent() {
    HomeScreen(Destinations.Watchlist)
}

@Composable
@Preview
fun HomePlusContent() {
    HomeScreen(Destinations.Plus)
}

@Composable
@Preview
fun HomeDownloadsContent() {
    HomeScreen(Destinations.Downloads)
}

@Composable
@Preview
fun HomeProfileContent() {
    HomeScreen(Destinations.Profile)
}