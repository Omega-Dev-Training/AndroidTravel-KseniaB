package com.example.myfirstproject.ui.categories

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myfirstproject.R
import com.example.myfirstproject.ui.base.BaseFragment
import com.example.myfirstproject.ui.main.MainActivity

class CategoriesFragment: AppCompatActivity(), CategoriesView {


//    val recyclerView: RecyclerView = findViewById(R.id.recycle_view)!!
//    val categoriesList = listOf(
//        MainActivity.Categories("Must see", R.drawable.must_see),
//        MainActivity.Categories("Cultural", R.drawable.rectangle_2),
//        MainActivity.Categories("Architecture", R.drawable.rectangle_2_1),
//        MainActivity.Categories("Southern Rome", R.drawable.rectangle_2_2),
//        MainActivity.Categories("Museums", R.drawable.rectangle_2_3),
//    )
//
//    val nameList = listOf<String>("Must see", "Cultural", "Architecture", "Southern Rome", "Museums")
//    val adapter = CustomRecyclerAdapter(categoriesList)
//    recyclerView.adapter = adapter
//
//    val location = GridLayoutManager(this, 2, RecyclerView.VERTICAL, false)
//    location.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
//        override fun getSpanSize(position: Int): Int {
//            return if (position == 0) 2
//            else 1
//        }
//    }
//    recyclerView.layoutManager = location
//
//    data class Categories(
//        val name: String,
//        val image: Int
//    )
}