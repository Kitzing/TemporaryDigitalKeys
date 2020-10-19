package com.example.mobilecomputingproject.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface KeyDatabaseDao {

    @Insert
    fun insert(key: Key)

    @Update
    fun update(key: Key)

    @Query("SELECT * from keys_table WHERE keyId = :key")
    fun get(key: Long): Key?

    @Query("DELETE FROM keys_table")
    fun clear()


    @Query("SELECT * FROM keys_table WHERE key_owner = :owner ORDER BY keyId DESC")
    fun getAllKeysForOwner(owner: Long): LiveData<List<Key>>

}