package com.example.mobilecomputingproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.mobilecomputingproject.ui.lend.LendFragmentDirections
import kotlinx.android.synthetic.main.fragment_add.view.*
import kotlinx.android.synthetic.main.fragment_lend.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AddFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AddFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_add, container, false)


        root.select_key_button.setOnClickListener{

            //TODO add logic to get the NFC for the specific key you want to add
        }

        root.add_key_button.setOnClickListener{
                view : View ->
            view.findNavController().navigate(AddFragmentDirections.actionAddFragmentToNavigationNotifications())

            //TODO make sure fields has values before added to database
            //TODO add key to the database
        }
        // Inflate the layout for this fragment
        return root
    }


    }
