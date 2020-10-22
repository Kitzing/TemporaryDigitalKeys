package com.example.mobilecomputingproject.ui.mykeys

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mobilecomputingproject.R

import kotlinx.android.synthetic.main.mykeys_list_item.view.*

//Adapter for creating items in My keys key list

class MyKeysAdapter (private val keyList: List<KeyListItem> ,private val listener: MyKeysAdapter.OnButtonClickListener): RecyclerView.Adapter<MyKeysAdapter.KeyViewHolder>() {


    inner class KeyViewHolder (itemView : View) : RecyclerView.ViewHolder (itemView), View.OnClickListener {
        val imageView: ImageView = itemView.key_image_view
        val name: TextView = itemView.key_text_view_name
        val button: Button = itemView.edit_button

        init {
            button.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                listener.onButtonClick(position, button)
            }
        }

    }

    interface OnButtonClickListener{
        fun onButtonClick(position: Int, button: Button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KeyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.mykeys_list_item,
            parent, false)

        return KeyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: KeyViewHolder, position: Int) {
        //val item = data[position]
        val currentItem = keyList[position]


        holder.imageView.setImageResource(R.drawable.ic_key)
        holder.name.text = currentItem.name
    }

    override fun getItemCount() = keyList.size


}

data class KeyListItem (val name: String) {
}