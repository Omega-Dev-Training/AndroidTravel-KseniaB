package com.example.myfirstproject.ui.main

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.WindowManager
import androidx.appcompat.widget.Toolbar
import com.example.myfirstproject.BuildConfig
import com.example.myfirstproject.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sportsmen_profile)
        window.statusBarColor = Color.TRANSPARENT
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.decorView.systemUiVisibility = window.decorView.systemUiVisibility or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN

        Log.d("Report", printAppInfo())

    }

//    override fun onSupportNavigateUp(): Boolean {
//        onBackPressed()
//        return true
//    }

//    val toolbar: Toolbar = (Toolbar) findViewById(R.id.main_info_toolbar);
//    setSupportActionBar(toolbar)
//    toolbar.setNavigationOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            // back button pressed
//        }
//    })

    private fun printAppInfo(): String {
        var info =""
        if (BuildConfig.DEBUG){
             info = "App Info: com.example.myfirstproject v1.0(1)"
        }
        return info
    }
}