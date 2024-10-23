package org.interopexample.com

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

expect fun calculateSha256Hash(input: String): String