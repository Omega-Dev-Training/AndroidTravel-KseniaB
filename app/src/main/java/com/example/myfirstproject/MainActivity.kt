package com.example.myfirstproject

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.WindowManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_page)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)
        window.statusBarColor = Color.TRANSPARENT
//        val info = printAppInfo(Log.d("Report", "App Info: co.android.someappkotlin v1.0(1)"))
//        println(info)
        Log.d("Report", printAppInfo())

    }
    private fun printAppInfo(): String {
        var info =""
        if (BuildConfig.DEBUG){
             info = "App Info: com.example.myfirstproject v1.0(1)"
        }
        return info
    }
}