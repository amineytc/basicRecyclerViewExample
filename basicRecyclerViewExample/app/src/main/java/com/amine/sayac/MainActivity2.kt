package com.amine.basicRecyclerViewExample

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.recycler_row.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val choosePainterImage = intent.getIntExtra("artistPaintingImages", 0)
        val bitmap = BitmapFactory.decodeResource(applicationContext.resources,choosePainterImage)
        imageView.setImageBitmap(bitmap)
        /*
        val chosePainter = SingletonClass.ChosePainter
        val choseImages = chosePainter.image
        imageView.setImageBitmap(choseImages)
            */
    }
}