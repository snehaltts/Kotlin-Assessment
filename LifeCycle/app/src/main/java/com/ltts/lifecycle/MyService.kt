package com.ltts.lifecycle

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.util.Log

class MyService : Service() {
    lateinit var mp: MediaPlayer
    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }

    override fun onCreate() {
        super.onCreate()
        Log.i("my tag","Service Created")
        mp = MediaPlayer.create(this,R.raw.abc)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.i("mytag","Service Started")
        mp.start()
        return super.onStartCommand(intent, flags, startId)
    }
    override fun onDestroy(){
        super.onDestroy()

        Log.i("mytag","Service Destroyeed")
        mp.stop()
    }
}