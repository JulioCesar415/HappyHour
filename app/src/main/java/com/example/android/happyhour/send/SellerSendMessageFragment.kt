package com.example.android.happyhour.send

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.android.happyhour.R
import com.example.android.happyhour.databinding.FragmentSellerSendMessageBinding

class SellerSendMessageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        inflate xml layout
        val binding: FragmentSellerSendMessageBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_seller_send_message, container, false
        )

//        navigate to SellerMessagesFragment when send button is clicked
        binding.sendHappyHourMessageButton.setOnClickListener {
            findNavController().navigate(SellerSendMessageFragmentDirections.actionSellerSendMessageFragmentToSellerMessagesFragment())
        }
//        return xml layout root
        return binding.root
    }

}