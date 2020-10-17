package com.example.mobilecomputingproject.ui.settings

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mobilecomputingproject.R
import com.example.mobilecomputingproject.ui.receive.ReceiveAdapter
import kotlinx.android.synthetic.main.keys_list_item.view.*
import kotlinx.android.synthetic.main.receive_list_item.view.*

class KeyAdapter (private val keyList: List<KeyListItem> ): RecyclerView.Adapter<KeyAdapter.KeyViewHolder>() {



    class KeyViewHolder (itemView : View) : RecyclerView.ViewHolder (itemView) {
        val imageView: ImageView = itemView.key_image_view
        val name: TextView = itemView.key_text_view_name
        val address: TextView = itemView.key_text_view_address

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KeyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.keys_list_item,
            parent, false)

        return KeyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: KeyViewHolder, position: Int) {
        val currentItem = keyList[position]

        holder.imageView.setImageResource(currentItem.imageResource)
        holder.name.text = currentItem.name
        holder.address.text = currentItem.address

    }

    override fun getItemCount() = keyList.size


}

data class KeyListItem (val imageResource: Int, val name: String, val address: String) {
}