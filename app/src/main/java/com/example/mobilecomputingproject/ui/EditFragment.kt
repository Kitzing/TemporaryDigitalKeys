package com.example.mobilecomputingproject.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.mobilecomputingproject.R
import kotlinx.android.synthetic.main.fragment_edit.view.*


class EditFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val root = inflater.inflate(R.layout.fragment_edit, container, false)

        //TODO fill text fields with values from database


        root.edit_select_key_button.setOnClickListener {

            //TODO add logic to get the NFC for the specific key you want to add
        }

        root.save_key_button.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(EditFragmentDirections.actionEditFragmentToNavigationMykeys())

            //TODO make sure fields has values before change in the database
            //TODO change information in database
        }

        return root

    }


}