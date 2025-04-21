package com.mohamed.morse.moviear

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform