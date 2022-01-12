package com.example.android.happyhour.main

import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.example.android.happyhour.database.Message

@BindingAdapter("companyNameFormatted")
fun TextView.setCompanyNameFormatted(item: Message?){
    item?.let {
        text = item.companyName
    }
}