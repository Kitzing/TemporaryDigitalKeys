package com.example.mobilecomputingproject.ui.settings

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mobilecomputingproject.R
import com.example.mobilecomputingproject.SelectKeyListItem
import com.example.mobilecomputingproject.database.Key
import com.example.mobilecomputingproject.database.KeyDatabaseDao
import com.example.mobilecomputingproject.ui.receive.ReceiveListItem

class SettingsViewModel() : ViewModel() {

    //, application: Application

   /* private val _text = MutableLiveData<String>().apply {
        value = "This is notifications Fragment"
    }
   val text: LiveData<String> = _text



    val database = dataSource

    val keys = database.getAllKeysForOwner(1)

   // private val key: LiveData<Key>


    private val _yourKeysList = MutableLiveData<ArrayList<KeyListItem>>()
    val yourKeysList: LiveData<ArrayList<KeyListItem>>
        get() = _yourKeysList

    init {
        val resList = ArrayList<KeyListItem>()
        val ownerIds = database.getAllKeysForOwner(1)

        for(i in 0 until ownerIds.size())
        val item = KeyListItem(R.drawable.ic_lock, ownerIds, "Address and other fun information")
        resList += item
    }

    private fun createKeyList(): List<KeyListItem> {
        val resList = ArrayList<KeyListItem>()
        val ownerIds = database.getAllKeysForOwner()
    }*/



    val exampleList = createDummyList()


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