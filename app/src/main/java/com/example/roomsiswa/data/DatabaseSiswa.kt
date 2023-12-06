package com.example.roomsiswa.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Siswa::class], version = 1, exportSchema = false)
abstract class DatabaseSiswa : RoomDatabase() {
    abstract fun siswaDao() : SiswaDao

    companion object{
        @Volatile
        private var Instanse: DatabaseSiswa? = null

        fun getDatabase(context: Context): DatabaseSiswa{
            return (Instanse?: synchronized(this){
                Room.databaseBuilder(context,
                    DatabaseSiswa::class.java,
                    "siswa_database")
                    .build().also { Instanse=it }
            })
        }
    }
}