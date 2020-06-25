package com.example.kotlin_training

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import services.MostPopularApi

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        GlobalScope.launch {
//
//            var resp = MostPopularApi.invoke().getViewedData("8kBnR1GlnL50G9GYl6t7QffrPUOmG5n9")
//
//            delay(3000L)
//            Toast.makeText(this@MainActivity,resp.toString(),Toast.LENGTH_LONG).show()
//        }
    }


}