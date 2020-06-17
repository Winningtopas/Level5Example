package com.example.level2example

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ReminderDao {

    @Query("SELECT * FROM reminderTable")
    fun getAllReminders(): LiveData<List<Reminder>> // not using coroutines for this anymore
    //suspend means that it can not be used without using Coroutines

    @Insert
    suspend fun insertReminder(reminder: Reminder)

    @Delete
    suspend fun deleteReminder(reminder: Reminder)

    @Update
    suspend fun updateReminder(reminder: Reminder)

}
