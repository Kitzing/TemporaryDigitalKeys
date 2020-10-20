package com.example.mobilecomputingproject



import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mobilecomputingproject.R
import com.example.mobilecomputingproject.ui.receive.ReceiveListItem

class SelectViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is notifications Fragment"
    }
    // val text: LiveData<String> = _text

    val exampleList = generateDummyList(20)


    private fun generateDummyList(size: Int): List<SelectKeyListItem> {
        val list = ArrayList<SelectKeyListItem>()
        for (i in 0 until size) {
            val drawable = when (i % 3) {
                0 -> R.drawable.ic_lock
                1 -> R.drawable.ic_lock
                else -> R.drawable.ic_lock
            }
            val item = SelectKeyListItem(drawable, "Item $i", "Address and other fun information")
            list += item
        }

        return list
    }

}