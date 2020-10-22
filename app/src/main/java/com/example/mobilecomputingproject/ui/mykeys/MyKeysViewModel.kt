package com.example.mobilecomputingproject.ui.mykeys

import androidx.lifecycle.ViewModel

class MyKeysViewModel() : ViewModel() {



    //TODO take items from database instead
    val exampleList = createDummyList()


    //Creates a dummy list of items, instead of using database
    private fun createDummyList(): List<KeyListItem> {
        val list = ArrayList<KeyListItem>()

        val item1 = KeyListItem("Home key")
        val item2 = KeyListItem("Storage room")
        val item3 = KeyListItem("Car key")

        list += item1
        list += item2
        list += item3


        return list

    }

}