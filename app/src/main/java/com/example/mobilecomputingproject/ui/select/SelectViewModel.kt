package com.example.mobilecomputingproject.ui.select



import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SelectViewModel : ViewModel() {


    //TODO Take items from database instead
    val exampleList = createDummyList()

    //Creates a dummy list of items, instead of using database
    private fun createDummyList(): List<SelectKeyListItem> {
        val list = ArrayList<SelectKeyListItem>()

        val item1 = SelectKeyListItem("Home key")
        val item2 = SelectKeyListItem("Storage room")
        val item3 = SelectKeyListItem("Car key")

        list += item1
        list += item2
        list += item3


        return list

    }


}