package com.example.android.happyhour.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.android.happyhour.database.MessageDatabaseDao

class MainViewModel (val database: MessageDatabaseDao, application: Application): AndroidViewModel(application){

//    define messages and getAllMessages() from database DAO
    val messages = database.getMessages()

    private val _navigateToBuyerMessages = MutableLiveData<Boolean>()
    val navigateToBuyerMessages : LiveData<Boolean>
        get() = _navigateToBuyerMessages

    private val _navigateToSellerMessages = MutableLiveData<Boolean>()
    val navigateToSellerMessages : LiveData<Boolean>
        get() = _navigateToSellerMessages

    private val  _name = MutableLiveData<String>()
    val name : LiveData<String>
    get() = _name



}