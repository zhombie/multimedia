package kz.zhombie.multimedia

import android.content.Context
import android.net.Uri

fun Context.getMimeType(uri: Uri): String? {
    return contentResolver?.getType(uri)
}