package org.interopexample.com

import android.os.Build
import java.security.MessageDigest

class AndroidPlatform : Platform {
    override val name: String = "Android ${Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()
actual fun calculateSha256Hash(input: String): String {
    val bytes = input.toByteArray()

    val md = MessageDigest.getInstance("SHA-256");
    val digest = md.digest(bytes)
    return digest.fold("", { str, it -> str + "%02x".format(it) })
}