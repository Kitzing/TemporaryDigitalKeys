package com.example.mobilecomputingproject.ui.receive

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mobilecomputingproject.R
import com.example.mobilecomputingproject.ui.lend.LendAdapter
import com.example.mobilecomputingproject.ui.lend.LendViewModel
import kotlinx.android.synthetic.main.fragment_lend.view.*
import kotlinx.android.synthetic.main.fragment_receive.view.*

class ReceiveFragment : Fragment(), ReceiveAdapter.OnButtonClickListener {

    private lateinit var receiveViewModel: ReceiveViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        receiveViewModel =
            ViewModelProviders.of(this).get(ReceiveViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_receive, container, false)


        root.receive_list.adapter = ReceiveAdapter(ReceiveViewModel().exampleList, this)
        root.receive_list.layoutManager = LinearLayoutManager(this.context)
        root.receive_list.setHasFixedSize(true)

        return root
    }


    override fun onButtonClick(position: Int, button: Button) {
        val clickedItem = LendViewModel().exampleList[position]
        val name = clickedItem.name
        Toast.makeText(
            this.context,
            "$name is now activated, please hold your phone against the receiver",
            Toast.LENGTH_LONG
        ).show()

        //TODO Launch NFC to be able to open lock
    }

}