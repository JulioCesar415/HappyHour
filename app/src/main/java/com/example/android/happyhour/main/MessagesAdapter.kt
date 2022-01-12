package com.example.android.happyhour.main


import android.view.LayoutInflater
import com.example.android.happyhour.database.Message
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.android.happyhour.databinding.ListItemCompanyNameBinding


class MessagesAdapter : ListAdapter<Message, MessagesAdapter.ViewHolder>(MessageDiffCallback()){

    //    hold list of Message. use adapter to expose data into RecyclerView API
    var data = listOf<Message>()


//    creates viewHolders
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    return ViewHolder.from(parent)
}

    //    tells RecyclerView how to draw item. Takes two arguments. holder and position to bind
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        position that needs to be bind
        val item = getItem(position)

//        set text of view in viewHolder
        holder.bind(item)
    }


//    ViewHolder class extends RecyclerView.ViewHolder
    class ViewHolder private constructor(val binding: ListItemCompanyNameBinding): RecyclerView.ViewHolder(binding.root){

    fun bind(item: Message) {
        binding.message = item
        binding.executePendingBindings()
    }
//            val res = itemView.context.resources
//            binding.companyNameTextViewList.text = item.companyName
//        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                //        inflate layout from xml
                val layoutInflater = LayoutInflater.from(parent.context)
                //        inflate layout
                val binding = ListItemCompanyNameBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }
    }

    class MessageDiffCallback: DiffUtil.ItemCallback<Message>(){
        override fun areItemsTheSame(oldItem: Message, newItem: Message): Boolean {
            return oldItem.companyName == newItem.companyName
        }

        override fun areContentsTheSame(oldItem: Message, newItem: Message): Boolean {
            return oldItem == newItem
        }
    }

}