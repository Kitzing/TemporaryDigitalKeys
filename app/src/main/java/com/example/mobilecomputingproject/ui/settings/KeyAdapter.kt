package com.example.mobilecomputingproject.ui.settings

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mobilecomputingproject.R
import com.example.mobilecomputingproject.database.Key

import kotlinx.android.synthetic.main.settings_keys_list_item.view.*

class KeyAdapter (private val listener: KeyAdapter.OnButtonClickListener): RecyclerView.Adapter<KeyAdapter.KeyViewHolder>() {


    var data = listOf<Key>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    inner class KeyViewHolder (itemView : View) : RecyclerView.ViewHolder (itemView), View.OnClickListener {
        val imageView: ImageView = itemView.key_image_view
        val name: TextView = itemView.key_text_view_name
        val address: TextView = itemView.key_text_view_address
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
            R.layout.settings_keys_list_item,
            parent, false)

        return KeyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: KeyViewHolder, position: Int) {
        val item = data[position]

        holder.imageView.setImageResource(R.drawable.ic_key)
        holder.name.text = item.keyName.toString()
        holder.address.text = item.address.toString()
       // holder.imageView.setImageResource(currentItem.imageResource)
       // holder.name.text = currentItem.name
       // holder.address.text = currentItem.address

    }

    override fun getItemCount() = data.size


}

data class KeyListItem (val imageResource: Int, val name: String, val address: String) {
}