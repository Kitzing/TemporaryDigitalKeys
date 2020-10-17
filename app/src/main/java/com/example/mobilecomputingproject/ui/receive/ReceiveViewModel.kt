package com.example.mobilecomputingproject.ui.receive

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mobilecomputingproject.R
import com.example.mobilecomputingproject.ui.lend.LendListItem

class ReceiveViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"
    }
  //  val text: LiveData<String> = _text


    val exampleList = generateDummyList(20)


    private fun generateDummyList(size: Int): List<ReceiveListItem> {
        val list = ArrayList<ReceiveListItem>()
        for (i in 0 until size) {
            val drawable = when (i % 3) {
                0 -> R.drawable.ic_lock
                1 -> R.drawable.ic_lock
                else -> R.drawable.ic_lock
            }
            val item = ReceiveListItem(drawable, "Item $i", "Line 2", "Date")
            list += item
        }

        return list
    }
}