package com.example.mobilecomputingproject.ui.select

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mobilecomputingproject.R
import com.example.mobilecomputingproject.ui.select.ChooseFragmentDirections.*
import kotlinx.android.synthetic.main.fragment_select.view.*






class ChooseFragment : Fragment(), SelectKeyAdapter.OnButtonClickListener {

        override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
        ): View? {
        val root = inflater.inflate(R.layout.fragment_select, container, false)


        root.your_keys_list_choose.adapter = SelectKeyAdapter(SelectViewModel().exampleList, this)
        root.your_keys_list_choose.layoutManager = LinearLayoutManager(this.context)
        root.your_keys_list_choose.setHasFixedSize(true)


        return root
        }




    override fun onButtonClick(position: Int, keyName: String) {
        //TODO add item to database

        findNavController().navigate(
            actionChooseFragmentToSendFragment(
                keyName
            )
        )
    }
}