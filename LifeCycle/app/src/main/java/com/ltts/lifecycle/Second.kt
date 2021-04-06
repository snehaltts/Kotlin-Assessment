package com.ltts.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class Second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        buttonStart.setOnClickListener {
            var i= Intent(this,MyService::class.java)
            startActivity(i)
        }
        buttonStop.setOnClickListener {
            var i=Intent(this,MyService::class.java)
            stopService(i)
        }
    }
}