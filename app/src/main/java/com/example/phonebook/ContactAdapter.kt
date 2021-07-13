package com.example.phonebook

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import java.security.AccessControlContext

class ContactAdapter (var contactList:List<Contacts>,var context: Context):RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.contact_list_items,parent,false)
        return ContactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
    var currentList=contactList.get(position)
        holder.tvname.text=currentList.names
        holder.tvphone.text=currentList.phoneNumber
        holder.tvemail.text=currentList.email
    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}
class ContactViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvname=itemView.findViewById<TextView>(R.id.tvname)
    var tvphone=itemView.findViewById<TextView>(R.id.tvphone)
    var tvemail=itemView.findViewById<TextView>(R.id.tvemail)

}


