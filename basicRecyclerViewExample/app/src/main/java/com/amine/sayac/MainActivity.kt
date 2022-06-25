package com.amine.basicRecyclerViewExample

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var painterNames = ArrayList<String>()

        painterNames.add("LeonardoDaVinci")
        painterNames.add("PaulCezanne")
        painterNames.add("Picasso")
        painterNames.add("RembrandtVanRijn")
        painterNames.add("VelazquezDiego")
        painterNames.add("VincentVanGogh")
        painterNames.add("WassilyKandinsky")


        val daVinciDrawableId = R.drawable.leonardo_da_vinci
        val paulCezanneDrawableId = R.drawable.paul_cezanne
        val picassoDrawableId = R.drawable.picasso
        val rembrandtVanRijnDrawableId = R.drawable.rembrandt_van_rijn
        val velazquezDiegoDrawableId = R.drawable.velazquez_diego
        val vincentVanGoghDrawableId = R.drawable.vincent_van_gogh
        val wassilyKandinskyDrawableId = R.drawable.wassily_kandinsky


        var artistNameDrawableList = ArrayList<Int>()
        artistNameDrawableList.add(daVinciDrawableId)
        artistNameDrawableList.add(paulCezanneDrawableId)
        artistNameDrawableList.add(picassoDrawableId)
        artistNameDrawableList.add(rembrandtVanRijnDrawableId)
        artistNameDrawableList.add(velazquezDiegoDrawableId)
        artistNameDrawableList.add(vincentVanGoghDrawableId)
        artistNameDrawableList.add(wassilyKandinskyDrawableId)

        // Adapter

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val adapter = RecyclerAdapter(painterNames, artistNameDrawableList)
        recyclerView.adapter = adapter
    }
}