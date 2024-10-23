package org.interopexample.com

import com.interopexample.com.CryptoExample
import kotlinx.cinterop.ExperimentalForeignApi
import platform.UIKit.UIDevice

class IOSPlatform : Platform {
    override val name: String =
        UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual fun getPlatform(): Platform = IOSPlatform()

@OptIn(ExperimentalForeignApi::class)
actual fun calculateSha256Hash(input: String): String {
    return CryptoExample.ToSHA256(input).toString()
}