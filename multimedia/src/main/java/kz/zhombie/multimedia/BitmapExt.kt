package kz.zhombie.multimedia

import android.graphics.BitmapFactory
import kz.zhombie.multimedia.model.Resolution
import java.io.FileNotFoundException
import java.io.InputStream

@Throws(FileNotFoundException::class)
fun InputStream.getImageResolution(): Resolution {
    val options = BitmapFactory.Options()
    options.inJustDecodeBounds = true
    BitmapFactory.decodeStream(this, null, options)
    return Resolution(options.outWidth, options.outHeight)
}