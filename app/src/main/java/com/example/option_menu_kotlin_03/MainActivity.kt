package com.example.option_menu_kotlin_03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menus, menu)
        return true


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId)
        {
            R.id.action_setting ->
            {
                msgshow(" setting")

               // Toast.makeText(applicationContext, "click on setting", Toast.LENGTH_LONG).show()
                true
            }

            R.id.action_search ->
            {
                msgshow("search")

              //  Toast.makeText(applicationContext, "click on search", Toast.LENGTH_LONG).show()
                true
            }
            R.id.action_profile ->
            {
                msgshow("profile")

                //  Toast.makeText(applicationContext, "click on search", Toast.LENGTH_LONG).show()
                true
            }
            else ->

               Toast.makeText(applicationContext, "Nothing selected", Toast.LENGTH_LONG).show()
        }

        return super.onOptionsItemSelected(item)

    }

    fun msgshow(msg: String)
    {

        Toast.makeText(applicationContext, msg, Toast.LENGTH_LONG).show()


    }
}
