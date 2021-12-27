package com.example.android.happyhour.messageDetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.android.happyhour.R
import com.example.android.happyhour.databinding.FragmentMessageDetailBinding


class MessageDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        inflate xml layout
        val binding: FragmentMessageDetailBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_message_detail, container, false
        )

//        return xml root
        return binding.root
    }

}