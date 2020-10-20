package com.example.mobilecomputingproject.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "keys_table")
data class Key(

    @PrimaryKey(autoGenerate = true)
    var keyId: Long = 0L,

    @ColumnInfo(name = "key_owner")
    var keyOwner: Long,

    @ColumnInfo(name = "nfckey" )
    var nfcKey: Long,

    @ColumnInfo(name = "Address")
    var address: Long,

    @ColumnInfo(name = "City")
    var city: Long,

    @ColumnInfo(name = "Zip_code")
    var zipCode: Long,

    @ColumnInfo(name = "start_date" )
    var startDate: Date,

    @ColumnInfo(name = "end_date" )
    var endDate: Date,
    )