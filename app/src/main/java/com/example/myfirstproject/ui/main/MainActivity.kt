package com.example.myfirstproject.ui.main

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.WindowManager
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myfirstproject.BuildConfig
import com.example.myfirstproject.R
import com.example.myfirstproject.ui.categories.CustomRecyclerAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cinnabon)
        window.statusBarColor = Color.TRANSPARENT
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.decorView.systemUiVisibility = window.decorView.systemUiVisibility or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN

        Log.d("Report", printAppInfo())

//        val recyclerView: RecyclerView = findViewById(R.id.recycle_view)
//        val categoriesList = listOf(
//            Categories("Must see", R.drawable.must_see),
//            Categories("Cultural", R.drawable.rectangle_2),
//            Categories("Architecture", R.drawable.rectangle_2_1),
//            Categories("Southern Rome", R.drawable.rectangle_2_2),
//            Categories("Museums", R.drawable.rectangle_2_3),
//        )
//
//        val nameList = listOf<String>("Must see", "Cultural", "Architecture", "Southern Rome", "Museums")
//        val adapter = CustomRecyclerAdapter(categoriesList)
//        recyclerView.adapter = adapter
//
//        val location = GridLayoutManager(this, 2, RecyclerView.VERTICAL, false)
//        location.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
//            override fun getSpanSize(position: Int): Int {
//                return if (position == 0) 2
//                else 1
//            }
//        }
//        recyclerView.layoutManager = location

    }

    data class Categories(
    val name: String,
    val image: Int
)

    private fun printAppInfo(): String {
        var info =""
        if (BuildConfig.DEBUG){
             info = "App Info: com.example.myfirstproject v1.0(1)"
        }
        return info
    }
}