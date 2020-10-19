package com.example.mobilecomputingproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mobilecomputingproject.ui.settings.KeyAdapter
import com.example.mobilecomputingproject.ui.settings.SettingsViewModel
import kotlinx.android.synthetic.main.fragment_choose.view.*
import kotlinx.android.synthetic.main.fragment_lend.view.*
import kotlinx.android.synthetic.main.fragment_settings.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ChooseFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ChooseFragment : Fragment() {
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
        val root = inflater.inflate(R.layout.fragment_choose, container, false)
        // Inflate the layout for this fragment

        root.your_keys_list_choose.adapter = KeyAdapter(SettingsViewModel().exampleList)
        root.your_keys_list_choose.layoutManager = LinearLayoutManager(this.context)
        root.your_keys_list_choose.setHasFixedSize(true)

        root.add_button.setOnClickListener{
                view : View ->
            view.findNavController().navigate(R.id.action_chooseFragment_to_addFragment)
        }

        root.your_keys_list_choose.setOnClickListener{
            Toast.makeText(this.context,"Cell clicked", Toast.LENGTH_SHORT).show()
        }

        return root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ChooseFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ChooseFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}