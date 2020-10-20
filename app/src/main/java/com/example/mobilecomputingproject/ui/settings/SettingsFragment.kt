package com.example.mobilecomputingproject.ui.settings

import SettingsViewModelFactory
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mobilecomputingproject.R
import com.example.mobilecomputingproject.database.KeyDatabase
import com.example.mobilecomputingproject.ui.lend.LendAdapter
import com.example.mobilecomputingproject.ui.lend.LendFragmentDirections
import com.example.mobilecomputingproject.ui.receive.ReceiveAdapter
import com.example.mobilecomputingproject.ui.receive.ReceiveViewModel
import kotlinx.android.synthetic.main.fragment_lend.view.*
import kotlinx.android.synthetic.main.fragment_receive.view.*
import kotlinx.android.synthetic.main.fragment_settings.view.*

class SettingsFragment : Fragment(), KeyAdapter.OnButtonClickListener {

   // private lateinit var notificationsViewModel: SettingsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Help", "0")
        //notificationsViewModel =
         //   ViewModelProviders.of(this).get(SettingsViewModel::class.java)
        Log.d("Help", "0.1")
        val root = inflater.inflate(R.layout.fragment_settings, container, false)
       // val textView: TextView = root.findViewById(R.id.text_notifications)
       // notificationsViewModel.text.observe(viewLifecycleOwner, Observer {
       //     textView.text = it
       // })

        Log.d("Help", "1")

        val application = requireNotNull().application

        val dataSource = KeyDatabase.getInstance(application).KeyDatabaseDao
        val viewModelFactory = SettingsViewModelFactory(dataSource, application)

        Log.d("Help", "2")

        val settingsViewModel =
            ViewModelProvider(
                this, viewModelFactory).get(SettingsViewModel::class.java)

        Log.d("Help", "3")

        val adapter = KeyAdapter(this)
        root.your_keys_list.adapter = adapter
        root.your_keys_list.layoutManager = LinearLayoutManager(this.context)
        root.your_keys_list.setHasFixedSize(true)

        Log.d("Help", "4")

        settingsViewModel.keys.observe(viewLifecycleOwner, Observer { it?.let{
            adapter.data = it
        }
        })

        Log.d("Help", "5")


        root.save_button.setOnClickListener{
                Toast.makeText(this.context, "Your settings are saved", Toast.LENGTH_SHORT)
        }

        Log.d("Help", "6")

        return root
    }

    override fun onButtonClick(position: Int, button: Button) {
        TODO("Not yet implemented")
    }
}