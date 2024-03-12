package com.example.lab2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MusicAlbumAdapter(private val albums: List<MusicAlbum>) :
    RecyclerView.Adapter<MusicAlbumAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
        val artistTextView: TextView = itemView.findViewById(R.id.artistTextView)
        val yearTextView: TextView = itemView.findViewById(R.id.yearTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_music_album, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val album = albums[position]
        holder.titleTextView.text = album.title
        holder.artistTextView.text = album.artist
        holder.yearTextView.text = album.year.toString()

        // Обработка нажатия на элемент списка
        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            Toast.makeText(context, "Альбом: ${album.title} clicked!", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int = albums.size
}