package com.ankit.jare.infosysDataBase

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface InfosysDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveData(infosysEntity: InfosysEntity)

    @Query("SELECT * FROM infosys_app")
    suspend fun getRecords(): List<InfosysEntity>
}