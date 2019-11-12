package com.senior.coordinatorexample

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout.DEBUG_SHOW_PATH
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main_3.*
import kotlinx.android.synthetic.main.item_title.view.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_3)
        root.setDebugMode(DEBUG_SHOW_PATH)
        my_list.adapter = MyAdapter()
    }

    class MyAdapter : RecyclerView.Adapter<MyHolder>() {
        private val colors = listOf(
            Color.parseColor("#ED5565"),
            Color.parseColor("#FC6E51"),
            Color.parseColor("#FFCE54"),
            Color.parseColor("#A0D468"),
            Color.parseColor("#48CFAD"),
            Color.parseColor("#4FC1E9")
        )

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
            return MyHolder(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.item_title,
                    parent,
                    false
                )
            )
        }

        override fun getItemCount() = 100

        override fun onBindViewHolder(holder: MyHolder, position: Int) {
            holder.bind("title $position", colors[position % colors.size])
        }
    }

    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(title: String, color: Int) {
            itemView.title.text = title
            itemView.setBackgroundColor(color)
        }
    }
}
