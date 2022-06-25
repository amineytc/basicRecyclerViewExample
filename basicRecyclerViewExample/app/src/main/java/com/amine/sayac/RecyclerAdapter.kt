package com.amine.basicRecyclerViewExample

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row.view.*


class RecyclerAdapter(val artistList : ArrayList<String> , val pictureList : ArrayList<Int>) : RecyclerView.Adapter<RecyclerAdapter.PictureImagesVH>() {
    class PictureImagesVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PictureImagesVH {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        return PictureImagesVH(itemView)

    }

    override fun getItemCount(): Int {
        return artistList.size
    }

    override fun onBindViewHolder(holder: PictureImagesVH, position: Int) {
        holder.itemView.recyclerViewTextView.text = artistList.get(position)
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,MainActivity2::class.java)
            //intent.putExtra("hope ", artistList.get(position))
            intent.putExtra("artistPaintingImages", pictureList.get(position))


            /*
            val singleton = SingletonClass.ChosePainter
            singleton.image = pictureList.get(position)
            */

            holder.itemView.context.startActivity(intent)
        }
    }
}