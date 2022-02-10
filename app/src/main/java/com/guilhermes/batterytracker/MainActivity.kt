package com.guilhermes.batterytracker

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#373a59")))
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}