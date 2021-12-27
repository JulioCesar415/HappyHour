package com.example.android.happyhour.main


import android.view.LayoutInflater
import com.example.android.happyhour.database.Message
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.happyhour.R
import com.example.android.happyhour.api.TextItemViewHolder

class MessagesAdapter : RecyclerView.Adapter<TextItemViewHolder>(){
//    hold list of Message. use adapter to expose data into RecyclerView API
    var data = listOf<Message>()

//    let RecyclerView know when data displaying has changed
    set(value) {
//        update field/set value in setter
        field = value
//        method tells RecyclerView that dataset has changed. Tells RecyclerView to
//        immediately redraw everything on screen
        notifyDataSetChanged()
    }

//    creates viewHolders
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextItemViewHolder {
//        inflate layout from xml
        val layoutInflater = LayoutInflater.from(parent.context)
//        inflate layout
        val view = layoutInflater
            .inflate(R.layout.text_item_view, parent, false) as TextView
        return TextItemViewHolder(view)
    }

//    tells RecyclerView how to draw item. Takes two arguments. holder and position to bind
    override fun onBindViewHolder(holder: TextItemViewHolder, position: Int) {
//        position that needs to be bind
        val item = data[position]
//        set text of view in viewHolder
        holder.textView.text = item.companyName
    }

//    tell recycler view how many items it will be adapting to
    override fun getItemCount() = data.size

}