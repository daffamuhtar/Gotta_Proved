package com.daffamuhtar.gottaproved

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform