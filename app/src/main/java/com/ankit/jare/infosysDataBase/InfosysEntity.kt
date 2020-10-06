package com.ankit.jare.infosysDataBase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "infosys_app")
data class InfosysEntity(

        @PrimaryKey
        @ColumnInfo(name = "title")
        var title: String,

        @ColumnInfo(name = "description")
        var description: String,

        @ColumnInfo(name = "imageHref")
        var imageHref: String,

        @ColumnInfo(name = "headerTitle")
        var headerTitle: String
)