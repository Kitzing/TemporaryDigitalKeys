package com.example.mobilecomputingproject.ui.lend

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mobilecomputingproject.R
import kotlinx.android.synthetic.main.lend_list_item.view.*

class LendAdapter (private val lendList: List<LendListItem> ): RecyclerView.Adapter<LendAdapter.LendViewHolder>() {



    class LendViewHolder (itemView : View) : RecyclerView.ViewHolder (itemView) {
        val imageView: ImageView = itemView.lend_image_view
        val textView1: TextView = itemView.lend_text_view_1
        val textView2: TextView = itemView.lend_text_view_2

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LendViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.lend_list_item,
        parent, false)

        return LendViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: LendViewHolder, position: Int) {
        val currentItem = lendList[position]

        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textView1.text = currentItem.text1
        holder.textView2.text = currentItem.text2
    }

    override fun getItemCount() = lendList.size


}

data class LendListItem (val imageResource: Int, val text1: String, val text2: String) {
}