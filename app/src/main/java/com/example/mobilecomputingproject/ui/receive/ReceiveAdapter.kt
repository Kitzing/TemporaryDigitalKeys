package com.example.mobilecomputingproject.ui.receive

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mobilecomputingproject.R
import kotlinx.android.synthetic.main.receive_list_item.view.*

class ReceiveAdapter (private val receiveList: List<ReceiveListItem> ): RecyclerView.Adapter<ReceiveAdapter.ReceiveViewHolder>() {



    class ReceiveViewHolder (itemView : View) : RecyclerView.ViewHolder (itemView) {
        val imageView: ImageView = itemView.receive_image_view
        val name: TextView = itemView.receive_text_view_name
        val address: TextView = itemView.receive_text_view_address
        val date: TextView = itemView.receive_text_view_date

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReceiveViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.receive_list_item,
            parent, false)

        return ReceiveViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ReceiveViewHolder, position: Int) {
        val currentItem = receiveList[position]

        holder.imageView.setImageResource(currentItem.imageResource)
        holder.name.text = currentItem.name
        holder.address.text = currentItem.address
        holder.date.text = currentItem.date
    }

    override fun getItemCount() = receiveList.size


}

data class ReceiveListItem (val imageResource: Int, val name: String, val address: String, val date: String) {
}