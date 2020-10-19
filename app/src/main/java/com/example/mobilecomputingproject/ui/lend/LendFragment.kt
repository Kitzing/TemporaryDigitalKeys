package com.example.mobilecomputingproject.ui.lend

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mobilecomputingproject.R
import kotlinx.android.synthetic.main.fragment_lend.view.*

class LendFragment : Fragment(), LendAdapter.OnButtonClickListener {

    private lateinit var lendViewModel: LendViewModel
    private lateinit var root : View


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        lendViewModel =
            ViewModelProviders.of(this).get(LendViewModel::class.java)
        root = inflater.inflate(R.layout.fragment_lend, container, false)
        //   val textView: TextView = root.findViewById(R.id.text_lend)
        //lendViewModel.text.observe(viewLifecycleOwner, Observer {
        //    textView.text = it
       // })


        root.lend_list.adapter = LendAdapter(LendViewModel().exampleList, this)
        root.lend_list.layoutManager = LinearLayoutManager(this.context)
        root.lend_list.setHasFixedSize(true)


            root.lend_key_button.setOnClickListener{
                view : View ->
            view.findNavController().navigate(LendFragmentDirections.actionNavigationHomeToChooseFragment())
        }


            return root
        }

    override fun onButtonClick(position: Int, button: Button) {
        val clickedItem = LendViewModel().exampleList[position]
        val name = clickedItem.name
        if(button.text == "Activate now") {
            Toast.makeText(this.context, "$name's key is now activated", Toast.LENGTH_LONG).show()
            button.setText("Inactivate")
            button.setBackgroundColor(Color.parseColor("#C62828"))
        } else {
            Toast.makeText(this.context, "$name's key is now inactivated", Toast.LENGTH_LONG).show()
            button.setText("Activate now")
            button.setBackgroundColor(Color.parseColor("#A5D6A7"))
        }



    }


}



