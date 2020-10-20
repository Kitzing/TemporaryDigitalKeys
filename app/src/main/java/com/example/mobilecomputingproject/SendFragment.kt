package com.example.mobilecomputingproject

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import com.example.mobilecomputingproject.ui.lend.LendFragmentDirections
import com.example.mobilecomputingproject.ui.lend.LendListItem
import com.example.mobilecomputingproject.ui.lend.LendViewModel
import kotlinx.android.synthetic.main.fragment_choose.view.*
import kotlinx.android.synthetic.main.fragment_send.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SendFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SendFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_send, container, false)

        root.send_button.setOnClickListener{
                view : View ->
            view.findNavController().navigate(R.id.action_sendFragment_to_navigation_home)
        }

        val args = SendFragmentArgs.fromBundle(requireArguments())

        root.sendKeyHeader.setText("Send ${args.keyName}")

        root.send_button.setOnClickListener { view ->

            //TODO make sure fields has values before being able to click on button

            when (view.getId()) {
                R.id.send_button -> {

                   val item = LendListItem(root.editTextSearchUser.text.toString(), "${root.editTextFromDate.text} - ${root.editTextToDate.text}", args.keyName, false)

                   //TODO create item in lendviewmodel List

                  //LendViewModel().exampleList += item1

                    view.findNavController().navigate(SendFragmentDirections.actionSendFragmentToNavigationHome())
                } } }

        /*
        setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val item1 = LendListItem("Testelitest", "2020-08-12 11:00 - 2020-08-12 13:00", "Home key")

                LendViewModel().exampleList += item1

                v.findNavController().navigate(SendFragmentDirections.actionSendFragmentToNavigationHome())
            }})
*/

        // Inflate the layout for this fragment
        return root
    }



    /*
      val item1 = LendListItem("Testelitest", "2020-08-12 11:00 - 2020-08-12 13:00", "Home key")

            LendViewModel().exampleList += item1

            view : View ->
            view.findNavController().navigate(SendFragmentDirections.actionSendFragmentToNavigationHome())
     */
/*
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SendFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SendFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

 */
}