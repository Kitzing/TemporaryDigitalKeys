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

    var exampleList = createDummyList()

    private fun createDummyList(): List<LendListItem>{
        val list = ArrayList<LendListItem>()

        val item1 = LendListItem("Anna Jansson", "2020-08-12 11:00 - 2020-08-12 13:00", "Home key", true)
        val item2 = LendListItem("Jesper Olofsson", "2020-08-13 00:01 - 2020-08-14 23:59", "Garage", false)
        val item3 = LendListItem("Truls Andersson", "2020-08-17 09:00 - 2020-08-17 21:00", "Storage room", false)
        val item4 = LendListItem("Ulla Eriksson", "2020-08-21 00:01 - 2020-08-27 23:59", "Home key", false)

        list += item1
        list += item2
        list += item3
        list += item4

        return list
    }
}

