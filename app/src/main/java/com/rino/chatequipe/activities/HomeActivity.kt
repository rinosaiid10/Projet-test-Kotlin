package com.rino.chatequipe.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.rino.chatequipe.R
import com.rino.chatequipe.adapters.FriendsRecyclerAdapter

class HomeActivity : AppCompatActivity() {
    lateinit var rvFriends : RecyclerView
    lateinit var fabChat : FloatingActionButton
    lateinit var friendsRecyclerAdapter : FriendsRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        rvFriends = findViewById(R.id.rvFriends)
        fabChat = findViewById(R.id.fabChat)

        fabChat.setOnClickListener{

        }
        friendsRecyclerAdapter = FriendsRecyclerAdapter()
        rvFriends.layoutManager = LinearLayoutManager(this)
        rvFriends.adapter = friendsRecyclerAdapter

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_home, menu )
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(item.itemId == R.id.itemSettings){

            Toast.makeText(this, "Settings clicked", Toast.LENGTH_LONG).show()
           /*
            Intent(this, SettingsActivity:: class.java).also {
                startActivity(it)
            }*/
        }
        if (item.itemId == R.id.itemLogout){

            Intent(this, AuthentificationActivity:: class.java).also {
                startActivity(it)
            }
        }
        return super.onOptionsItemSelected(item)
    }

}