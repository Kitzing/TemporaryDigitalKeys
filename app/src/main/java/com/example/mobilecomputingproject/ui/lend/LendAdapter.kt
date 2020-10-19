package com.example.mobilecomputingproject.ui.lend

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.mobilecomputingproject.R
import kotlinx.android.synthetic.main.lend_list_item.view.*

class LendAdapter (private val lendList: List<LendListItem>, private val listener: OnButtonClickListener): RecyclerView.Adapter<LendAdapter.LendViewHolder>() {



    inner class LendViewHolder (itemView : View) : RecyclerView.ViewHolder (itemView), View.OnClickListener {
        val imageView: ImageView = itemView.lend_image_view
        val name: TextView = itemView.lend_text_view_name
        val date: TextView = itemView.lend_text_view_date
        val keytype: TextView = itemView.lend_text_view_keytype
        val button: Button = itemView.button_activate

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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LendViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.lend_list_item,
        parent, false)

        return LendViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: LendViewHolder, position: Int) {
        val currentItem = lendList[position]

        holder.imageView.setImageResource(currentItem.imageResource)
        holder.name.text = currentItem.name
        holder.date.text = currentItem.date
        holder.keytype.text = currentItem.keytype

    }

    override fun getItemCount() = lendList.size


}

data class LendListItem (val imageResource: Int, val name: String, val date: String, val keytype: String) {
}