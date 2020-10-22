package com.example.mobilecomputingproject.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.mobilecomputingproject.R
import com.example.mobilecomputingproject.ui.lend.LendListItem
import kotlinx.android.synthetic.main.fragment_send.view.*



class SendFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_send, container, false)


        val args = SendFragmentArgs.fromBundle(requireArguments())

        root.sendKeyHeader.setText("Send ${args.keyName}")

        root.send_button.setOnClickListener { view ->

            //TODO make sure fields has values before being able to click on button

            when (view.getId()) {
                R.id.send_button -> {

                   val item = LendListItem(root.editTextSearchUser.text.toString(), "${root.editTextFromDate.text} - ${root.editTextToDate.text}", args.keyName, false)

                   //TODO add item to database



                    view.findNavController().navigate(SendFragmentDirections.actionSendFragmentToNavigationHome())
                } } }



        // Inflate the layout for this fragment
        return root
    }


}