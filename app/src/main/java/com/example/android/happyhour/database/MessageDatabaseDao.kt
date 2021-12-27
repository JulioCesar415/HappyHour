package com.example.android.happyhour.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

//DAO (Data Access Object) are main classes where we define the database interactions.
//DAO is an interface with functions explaining how we will use values in data class.
//@Query annotation tells function what values from data class it is using in function.

//these functions in DAO are used in ViewModel
@Dao
interface MessageDatabaseDao{

    @Query("SELECT * FROM message_table ORDER BY happy_hour_end_time ASC")
    fun getMessages(): LiveData<List<Message>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg message: Message)
}