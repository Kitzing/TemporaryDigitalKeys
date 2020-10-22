package com.example.mobilecomputingproject.ui.mykeys


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mobilecomputingproject.R
import kotlinx.android.synthetic.main.fragment_mykeys.view.*

class MyKeysFragment : Fragment(), MyKeysAdapter.OnButtonClickListener {



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_mykeys, container, false)

        //TODO fill your information text fields with users information from the database

        root.your_keys_list.adapter = MyKeysAdapter(MyKeysViewModel().exampleList, this)
        root.your_keys_list.layoutManager = LinearLayoutManager(this.context)
        root.your_keys_list.setHasFixedSize(true)


        root.save_button.setOnClickListener{
            //TODO update database with new values
                Toast.makeText(this.context, "Your settings are saved", Toast.LENGTH_SHORT)
        }

        root.add_button.setOnClickListener{
                view : View ->
            view.findNavController().navigate(MyKeysFragmentDirections.actionNavigationNotificationsToAddFragment())
        }


        return root
    }

    override fun onButtonClick(position: Int, button: Button) {
        findNavController().navigate(MyKeysFragmentDirections.actionNavigationMykeysToEditFragment())
        //TODO send value of selected key into edit fragment
    }
}