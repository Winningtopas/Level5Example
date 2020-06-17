package com.example.level2example

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "reminderTable") //entitiy needs to be stored in the database
data class Reminder(

    @ColumnInfo(name = "reminder") //column is called reminder
    var reminderText: String,

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long? = null //id is optional

) : Parcelable
