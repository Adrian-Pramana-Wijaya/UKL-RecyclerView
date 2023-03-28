package com.example.ukl_recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class CollectionMusicAdapter(private val listMusic: ArrayList<Music>) : RecyclerView.Adapter<CollectionMusicAdapter.GridViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): GridViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_grid_music, viewGroup, false)
        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(listMusic[position].photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
        holder.itemView.setOnClickListener { Toast.makeText(holder.itemView.context, "Kamu memilih " + listMusic [holder.adapterPosition].from, Toast.LENGTH_SHORT).show() }
    }

    override fun getItemCount(): Int {
        return listMusic.size
    }

    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photogrid)
    }
}