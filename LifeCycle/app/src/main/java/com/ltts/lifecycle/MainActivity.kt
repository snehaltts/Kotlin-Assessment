package com.ltts.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var myName: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        registerForContextMenu(editTextTextPersonName)

        Log.i("mytag", "Activity created")

        buttonSecond.setOnClickListener {
            var i = Intent(this, Second::class.java)
            startActivity(i)
        }
    }
    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ){
        super.onCreateContextMenu(menu, v, menuInfo)

        menuInflater.inflate(R.menu.mymenu,menu)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
    menuInflater.inflate(R.menu.mymenu,menu)
    return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean{
     var id : int = item.itemId
    if(id==R.id.idmyact){
        var i=Intent(this,Second::class.java)
        startActivity(i)
    }
    if(id==R.id.idtoast){
        Toast.makeText(this,"Toast selected",Toast.LENGTH_LONG).show()
    }
    return super.onContextItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {


    }


}

        override fun onStart() {
            super.onStart()
            Log.i("mylog","activity started")
        }
        override fun onPause() {
            super.onPause()
            super.onStart()
            Log.i("mylog","activity paused")
        }
        override fun onStop() {
            super.onStop()
            super.onStart()
            Log.i("mylog","activity stoped")
        }
        override fun onDestroy() {
            super.onDestroy()
            super.onStart()
            Log.i("mylog","activity destroyed")
        }
        override fun onRestart() {
            super.onRestart()
            super.onStart()
            Log.i("mylog", "activity restarted")
        }
}