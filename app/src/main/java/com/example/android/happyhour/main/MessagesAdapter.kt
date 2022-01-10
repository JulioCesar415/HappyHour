package com.example.android.happyhour.main


import android.view.LayoutInflater
import android.view.View
import com.example.android.happyhour.database.Message
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.happyhour.R


class MessagesAdapter : RecyclerView.Adapter<MessagesAdapter.ViewHolder>(){
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
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        inflate layout from xml
        val layoutInflater = LayoutInflater.from(parent.context)
//        inflate layout
        val view = layoutInflater
            .inflate(R.layout.list_item_company_name, parent, false)
        return ViewHolder(view)
    }

//    tells RecyclerView how to draw item. Takes two arguments. holder and position to bind
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        position that needs to be bind
        val item = data[position]
        val res = holder.itemView.context.resources
//        set text of view in viewHolder
        holder.businessName.text = item.companyName
    }

//    tell recycler view how many items it will be adapting to
    override fun getItemCount() = data.size

//    ViewHolder class extends RecyclerView.ViewHolder
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val businessName: TextView = itemView.findViewById(R.id.companyNameTextViewList)
    }

}