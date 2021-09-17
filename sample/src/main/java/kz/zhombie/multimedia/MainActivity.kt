package kz.zhombie.multimedia

import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kz.zhombie.multimedia.model.Image

class MainActivity : AppCompatActivity() {

    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image = Image(
            uri = Uri.EMPTY,
            displayName = "temp_image.jpg"
        )
        Log.d(TAG, "image: $image")
        Log.d(TAG, "image projection: " + Projection.Image.get())
    }

}