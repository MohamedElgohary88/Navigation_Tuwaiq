package com.example.navigation_tuwaiq

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(Toolbar!!)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setupDrawer()
    }
    private fun setupDrawer() {
        /* يتطلب عدة امور
        1- context -> (this)
         1- DrawerLayout -> (this)
          1- String Open -> (من ملف string)
           1- String Close -> (من ملف string)
        */
        val toggleDrawer = ActionBarDrawerToggle(this,DrawerLayout,R.string.Open,R.string.Close)
        DrawerLayout?.addDrawerListener(toggleDrawer)
        toggleDrawer.syncState()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            android.R.id.home -> {
                DrawerLayout?.openDrawer(GravityCompat.START)
                true
            }else -> true
        }
    }
}