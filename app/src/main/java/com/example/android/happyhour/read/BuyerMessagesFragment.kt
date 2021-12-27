package com.example.android.happyhour.read

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.android.happyhour.R
import com.example.android.happyhour.databinding.FragmentBuyerMessagesBinding

class BuyerMessagesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        inflate xml layout
        val binding: FragmentBuyerMessagesBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_buyer_messages, container, false
        )

//        return root xml
        return binding.root
    }

}