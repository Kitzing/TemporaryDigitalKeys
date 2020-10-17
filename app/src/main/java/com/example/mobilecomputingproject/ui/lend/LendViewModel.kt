package com.example.mobilecomputingproject.ui.lend

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mobilecomputingproject.R

class LendViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
   // val text: LiveData<String> = _text

   // val keyList: List<String> = listOf<String>("Abu","Praveen","Sathya","Yogesh","Ram")

    val exampleList = generateDummyList(20)


private fun generateDummyList(size: Int): List<LendListItem> {
    val list = ArrayList<LendListItem>()
    for (i in 0 until size) {
        val drawable = when (i % 3) {
            0 -> R.drawable.ic_key
            1 -> R.drawable.ic_key
            else -> R.drawable.ic_key
        }
        val item = LendListItem(drawable, "Item $i", "Line 2", "Keytypee")
        list += item
    }

    return list
}
}

