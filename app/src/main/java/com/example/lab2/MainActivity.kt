package com.example.lab2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MusicAlbumAdapter(getMusicAlbums())
    }

    private fun getMusicAlbums(): List<MusicAlbum> {
        // Здесь вы можете добавить свои альбомы или загрузить данные из JSON
        return listOf(
            MusicAlbum("Album 1", "Artist 1", 2020),
            MusicAlbum("Album 2", "Artist 2", 2018),
            MusicAlbum("Album 3", "Artist 3", 2015),
            MusicAlbum("Album 4", "Artist 4", 2017),
            MusicAlbum("Album 5", "Artist 5", 2016),
            MusicAlbum("Album 6", "Artist 6", 2019),
            MusicAlbum("Album 7", "Artist 7", 2021),
            MusicAlbum("Album 8", "Artist 8", 2014),
            MusicAlbum("Album 9", "Artist 9", 2013),
            MusicAlbum("Album 10", "Artist 10", 2012),
            MusicAlbum("Album 11", "Artist 11", 2011),
            MusicAlbum("Album 12", "Artist 12", 2010),
            MusicAlbum("Album 13", "Artist 13", 2009),
            MusicAlbum("Album 14", "Artist 14", 2008),
            MusicAlbum("Album 15", "Artist 15", 2007),
            MusicAlbum("Album 16", "Artist 16", 2006),
            MusicAlbum("Album 17", "Artist 17", 2005),
            MusicAlbum("Album 18", "Artist 18", 2004),
            MusicAlbum("Album 19", "Artist 19", 2003),
            MusicAlbum("Album 20", "Artist 20", 2002),
            MusicAlbum("Album 21", "Artist 21", 2001),
            MusicAlbum("Album 22", "Artist 22", 2000),
            MusicAlbum("Album 23", "Artist 23", 1999),
            MusicAlbum("Album 24", "Artist 24", 1998),
            MusicAlbum("Album 25", "Artist 25", 1997)
        )
    }
}

