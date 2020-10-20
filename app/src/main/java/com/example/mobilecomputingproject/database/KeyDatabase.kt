package com.example.mobilecomputingproject.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Key::class], version = 1, exportSchema = false)
abstract class KeyDatabase : RoomDatabase() {
    abstract val KeyDatabaseDao: KeyDatabaseDao

    companion object {

        @Volatile
        private var INSTANCE: KeyDatabase? = null

        fun getInstance(context: Context): KeyDatabase {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        KeyDatabase::class.java,
                        "key_databease"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }

}