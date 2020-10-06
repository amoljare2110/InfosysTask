package com.ankit.jare.infosysDataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [InfosysEntity::class], version = 1, exportSchema = false)
abstract class InfosysDataBase : RoomDatabase() {

    abstract fun wiproDao(): InfosysDao

    companion object {
        @Volatile
        private var INSTANCE: InfosysDataBase? = null

        fun getDatabase(context: Context): InfosysDataBase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                        context.applicationContext,
                        InfosysDataBase::class.java,
                        "infosys_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}