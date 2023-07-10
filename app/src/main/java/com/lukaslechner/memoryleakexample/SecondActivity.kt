package com.lukaslechner.memoryleakexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    private val listener = Listener()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    override fun onStart() {
        super.onStart()
        GlobalSingleton.register(listener)
    }

    private inner class Listener : GlobalSingletonListener {
        override fun onEvent() {}
    }
}