package com.example.myfirstproject.ui.main

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.WindowManager
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myfirstproject.BuildConfig
import com.example.myfirstproject.R
import com.example.myfirstproject.ui.categories.CustomRecyclerAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.categories_page_1)
        window.statusBarColor = Color.TRANSPARENT
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.decorView.systemUiVisibility = window.decorView.systemUiVisibility or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN

        Log.d("Report", printAppInfo())

        val recyclerView: RecyclerView = findViewById(R.id.recycle_view)
//        recyclerView.layoutManager = LinearLayoutManager(this)

        val categoriesList = listOf(
            Categories("Must see", R.drawable.must_see),
            Categories("Cultural", R.drawable.rectangle_2),
            Categories("Architecture", R.drawable.rectangle_2_1),
            Categories("Southern Rome", R.drawable.rectangle_2_2),
            Categories("Museums", R.drawable.rectangle_2_3),
            )

        val nameList = listOf<String>("Must see", "Cultural", "Architecture", "Southern Rome", "Museums")
        val adapter = CustomRecyclerAdapter(categoriesList)
        recyclerView.adapter = adapter

//        @Override
//        .getSpanSize(position) {
//            int mod = position % 6;
//
//            if(position == 0 || position == 1)
//                return 2;
//            else if(position < 6)
//                return 1;
//            else if(mod == 0 || mod == 1)
//                return 2;
//            else
//                return 1;
//        }
//    });
//
//    recyclerView.setLayoutManager(layoutManager);
    }

data class Categories(
    val name: String,
    val image: Int
)

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