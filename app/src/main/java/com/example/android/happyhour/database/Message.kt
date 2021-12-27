package com.example.android.happyhour.database

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

//this data class hold initial value needed throughout program

@Entity(tableName = "message_table")
data class Message(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    @ColumnInfo(name = "company_name")
    val companyName: String,
    @ColumnInfo(name = "happy_hour_start_time")
    val startTime: Long,
    @ColumnInfo(name = "happy_hour_end_time")
    val endTime: Long,
    @ColumnInfo(name = "happy_hour_message")
    val happyHourMessage: String
)