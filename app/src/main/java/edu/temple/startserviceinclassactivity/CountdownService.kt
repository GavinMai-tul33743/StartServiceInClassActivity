package edu.temple.startserviceinclassactivity

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import kotlinx.coroutines.delay

class CountdownService : Service() {

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val time = intent!!.getStringExtra("Time")
        Log.d("TEST", time.toString())
        if (time != null) {
            countdown(time)
        }
        return super.onStartCommand(intent, flags, startId)
    }

    fun countdown(_num : String){
        val number = _num.toInt()
        repeat(number){
            Log.d("TEST", it.toString())
        }
    }
}