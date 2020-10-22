package com.example.mobilecomputingproject.ui.select

import kotlinx.android.synthetic.main.select_key_list_item.view.*

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mobilecomputingproject.R

//Adapter for creating items in select key list

class SelectKeyAdapter (private val keyList: List<SelectKeyListItem>, private val listener: OnButtonClickListener): RecyclerView.Adapter<SelectKeyAdapter.SelectKeyViewHolder>() {



    inner class SelectKeyViewHolder (itemView : View) : RecyclerView.ViewHolder (itemView), View.OnClickListener {
        val imageView: ImageView = itemView.select_key_image_view
        val name: TextView = itemView.select_key_name
        //val address: TextView = itemView.select_key_address


        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                listener.onButtonClick(position, name.text.toString())
            }
        }

    }

    interface OnButtonClickListener{
        fun onButtonClick(position: Int, keyName: String)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SelectKeyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.select_key_list_item,
            parent, false)

        return SelectKeyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: SelectKeyViewHolder, position: Int) {
        val currentItem = keyList[position]

        holder.imageView.setImageResource(R.drawable.ic_lock)
        holder.name.text = currentItem.name
        //holder.address.text = currentItem.address

    }

    override fun getItemCount() = keyList.size

}

data class SelectKeyListItem (val name: String) {
}