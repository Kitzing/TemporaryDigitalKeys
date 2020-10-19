package com.example.mobilecomputingproject.ui.lend

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mobilecomputingproject.R
import kotlinx.android.synthetic.main.fragment_lend.view.*

class LendFragment : Fragment() {

    private lateinit var lendViewModel: LendViewModel


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        lendViewModel =
            ViewModelProviders.of(this).get(LendViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_lend, container, false)
        //   val textView: TextView = root.findViewById(R.id.text_lend)
        //lendViewModel.text.observe(viewLifecycleOwner, Observer {
        //    textView.text = it
       // })


        root.lend_list.adapter = LendAdapter(LendViewModel().exampleList)
        root.lend_list.layoutManager = LinearLayoutManager(this.context)
        root.lend_list.setHasFixedSize(true)


            root.lend_key_button.setOnClickListener{
                view : View ->
            view.findNavController().navigate(R.id.action_navigation_home_to_chooseFragment)
        }

            return root
        }



    }



