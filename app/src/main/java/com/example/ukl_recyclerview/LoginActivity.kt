package com.example.ukl_recyclerview

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class LoginActivity : AppCompatActivity(), NavigationBarView.OnItemSelectedListener {
    private lateinit var rvMusic: RecyclerView
    private var list: ArrayList<Music> = arrayListOf()
    lateinit var text: TextView
    lateinit var text2: TextView
    lateinit var nav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        supportActionBar?.hide()
        rvMusic = findViewById(R.id.rv_music)
        rvMusic.setHasFixedSize(true)

        nav = findViewById(R.id.bottom_navigation)
        nav.setOnItemSelectedListener(this)

        list.addAll(MusicesData.listData)
        showRecyclerCardView()


        text = findViewById(R.id.emailText)
        text2 = findViewById(R.id.namasatu)

        val email = intent.getStringExtra("String")
        if (email != null){
            text.text = email
            text2.text = email
        }
    }
    private fun showRecyclerCollection() {
        rvMusic.layoutManager = GridLayoutManager(this, 2)
        val CollectionMusicAdapter = CollectionMusicAdapter(list)
        rvMusic.adapter = CollectionMusicAdapter
    }
    private fun showRecyclerCardView() {
        rvMusic.layoutManager = LinearLayoutManager(this)
        val cardViewMusicAdapter = CardViewMusicAdapter(list)
        rvMusic.adapter = cardViewMusicAdapter
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_item, menu)
        return super.onCreateOptionsMenu(menu)
    }

    private fun showSelectedMusic(Music: Music) {
        Toast.makeText(this, "Kamu memilih " + Music.from, Toast.LENGTH_SHORT).show()
    }
    private fun setMode(selectedMode: Int) {
        Toast.makeText(this,"ini menu",Toast.LENGTH_SHORT).show()
        when (selectedMode) {
            R.id.action_collection -> {
                showRecyclerCollection()
            }
            R.id.action_cardview -> {
                Toast.makeText(applicationContext, "Test", Toast.LENGTH_SHORT).show()
            }
            R.id.action_collection -> {
                title = "SIPALING CARDVIEW"
                showRecyclerCardView()
            }

        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_cardview -> {
                showRecyclerCardView()
                return true
            }
            R.id.action_collection -> {
                showRecyclerCollection()
                return true
            }
            R.id.nav_settings -> {
                LoginActivity()
                return true
            }
            else -> return false
        }
    }
}