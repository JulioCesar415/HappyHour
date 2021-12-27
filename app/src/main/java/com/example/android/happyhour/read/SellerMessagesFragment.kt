package com.example.android.happyhour.read

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.android.happyhour.R
import com.example.android.happyhour.database.MessageDatabase
import com.example.android.happyhour.databinding.FragmentSellerMessagesBinding
import com.example.android.happyhour.main.MainViewModel
import com.example.android.happyhour.main.MainViewModelFactory
import com.example.android.happyhour.main.MessagesAdapter

class SellerMessagesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        inflate xml layout
        val binding: FragmentSellerMessagesBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_seller_messages, container, false
        )

        val application = requireNotNull(this.activity).application

        val dataSource = MessageDatabase.getInstance(application).messageDatabaseDao

        val viewModelFactory = MainViewModelFactory(dataSource, application)

        val mainViewModel = ViewModelProvider(this, viewModelFactory)
            .get(MainViewModel::class.java)

//        tell recyclerView about adapter
        val adapter = MessagesAdapter()
        binding.sellerMessagesList.adapter = adapter

        mainViewModel.messages.observe(viewLifecycleOwner, Observer {
            adapter.data = it
        })

        binding.lifecycleOwner = this

//        navigate to SellerSendMessageFragment when add message button is clicked
        binding.addHappyHourMessageButton.setOnClickListener {
            findNavController().navigate(SellerMessagesFragmentDirections.actionSellerMessagesFragmentToSellerSendMessageFragment())
        }
//        return xml root
        return binding.root
    }

}