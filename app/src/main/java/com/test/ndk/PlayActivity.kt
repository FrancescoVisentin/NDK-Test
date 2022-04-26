package com.test.ndk

import android.os.Bundle
import android.util.Log
import com.google.androidgamesdk.GameActivity


class PlayActivity : GameActivity() {
    companion object {
        init {
            System.loadLibrary("play-lib")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.play_activity)
        super.onCreate(savedInstanceState)
        Log.i("TAG","PIPPO")
    }

}