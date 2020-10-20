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


    val exampleList = createDummyList()


    private fun createDummyList(): List<ReceiveListItem>{
        val list = ArrayList<ReceiveListItem>()

        val item1 = ReceiveListItem("Olof Jansson", "Trollstigen 15, 417 52 Göteborg" ,"2020-08-12 11:00 - 2020-08-12 13:00")
        val item2 = ReceiveListItem("Axel Göransson", "Stockholmsgatan 11 lgh 1670, 874 98 Jönköping" , "2020-08-13 00:01 - 2020-08-14 23:59")
        val item3 = ReceiveListItem("Beata Andersson","890 78 Ullared" ,"2020-08-17 09:00 - 2020-08-17 21:00")
        val item4 = ReceiveListItem("Kurt Eriksson", "Stora Nygatan 57, 413 89 Kungsbacka" ,"2020-08-21 00:01 - 2020-08-27 23:59")
        val item5 = ReceiveListItem("Olivia Karlsson", "Ytterbyvägen 765, 767 09 Kiruna" , "2020-09-27 10:00 - 2020-09-27 10:30")
        val item6 = ReceiveListItem("Axel Göransson", "Trollstigen 15, 417 52 Göteborg" , "2020-10-07 11:00 - 2020-10-07 23:30")

        list += item1
        list += item2
        list += item3
        list += item4
        list += item5
        list += item6

        return list
    }
}

/*
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

 */