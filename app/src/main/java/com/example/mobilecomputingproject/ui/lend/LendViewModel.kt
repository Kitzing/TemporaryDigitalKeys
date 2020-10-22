package com.example.mobilecomputingproject.ui.lend

import android.util.Log
import android.widget.ArrayAdapter
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mobilecomputingproject.R

class LendViewModel : ViewModel() {


    //TODO take items from database instead
    var exampleList = createDummyList()


    //Creates a dummy list of items, instead of using database
    private fun createDummyList(): List<LendListItem>{

        val list = ArrayList<LendListItem>()

        val item1 = LendListItem("Anna Jansson", "2020-08-12 11:00 - 2020-08-12 13:00", "Home key", true)
        val item2 = LendListItem("Jesper Olofsson", "2020-08-13 00:01 - 2020-08-14 23:59", "Garage", false)
        val item3 = LendListItem("Truls Andersson", "2020-08-17 09:00 - 2020-08-17 21:00", "Storage room", false)
        val item4 = LendListItem("Ulla Eriksson", "2020-08-21 00:01 - 2020-08-27 23:59", "Home key", false)



       list.add(item1)
       list.add(item2)
       list.add(item3)
       list.add(item4)


        return list
    }


}

