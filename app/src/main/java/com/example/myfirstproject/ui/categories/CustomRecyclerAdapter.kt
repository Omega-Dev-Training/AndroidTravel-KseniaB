package com.example.myfirstproject.ui.categories


import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myfirstproject.R
import com.example.myfirstproject.ui.main.MainActivity


class CustomRecyclerAdapter(private val names: List<MainActivity.Categories>):  RecyclerView.Adapter<CustomRecyclerAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imageMustSee: ImageView = itemView.findViewById(R.id.image_must_see)
        val textMustSee: TextView = itemView.findViewById(R.id.text_must_see)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.must_see, parent, false)
        return MyViewHolder(itemView)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.imageMustSee.setImageResource(names[position].image)
        holder.textMustSee.text = names[position].name
    }

    override fun getItemCount(): Int {
        return names.size
    }

}

