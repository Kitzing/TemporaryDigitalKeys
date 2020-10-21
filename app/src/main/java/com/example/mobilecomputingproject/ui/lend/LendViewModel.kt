package com.example.mobilecomputingproject.ui.lend

import android.util.Log
import android.widget.ArrayAdapter
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mobilecomputingproject.R

class LendViewModel : ViewModel() {

   /* private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }

    */
   // val text: LiveData<String> = _text

   // val keyList: List<String> = listOf<String>("Abu","Praveen","Sathya","Yogesh","Ram")

    var exampleList = createDummyList()


    private fun createDummyList(): List<LendListItem>{
        //val test = MutableLiveData<MutableList<LendListItem>>()
        val list = ArrayList<LendListItem>()

        val item1 = LendListItem("Anna Jansson", "2020-08-12 11:00 - 2020-08-12 13:00", "Home key", true)
        val item2 = LendListItem("Jesper Olofsson", "2020-08-13 00:01 - 2020-08-14 23:59", "Garage", false)
        val item3 = LendListItem("Truls Andersson", "2020-08-17 09:00 - 2020-08-17 21:00", "Storage room", false)
        val item4 = LendListItem("Ulla Eriksson", "2020-08-21 00:01 - 2020-08-27 23:59", "Home key", false)



       list.add(item1)
       list.add(item2)
       list.add(item3)
       list.add(item4)

        //test.value = list

        return list
    }

    //fun addToList(name: String, date: String, keyType: String, activate: Boolean){
   /* fun addToList(item: LendListItem){
        //val item = LendListItem(name, date, keyType, activate)

        Log.d("Test", item.toString())

        exampleList.value?.add(item)

        Log.d("Test", exampleList.toString())
       // exampleList.
    }

    */
}

