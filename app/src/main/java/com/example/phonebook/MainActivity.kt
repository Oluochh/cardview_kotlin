 package com.example.phonebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rvcontact=findViewById<RecyclerView>(R.id.rvcontact)

        var contactList= listOf(
            Contacts("Gilly","09645756676","gillymyriam@gmail.com"),
            Contacts("Billy","0718154654","billyodengo@yahoo.com"),
            Contacts("Zena","0729230083","essyzeina@gmail.com"),
            Contacts("Babra","078976543","babrakoskei@gmail.com"),
            Contacts("Lister","074324567","listermponda@gmail.com"),
        )
        rvcontact.layoutManager=LinearLayoutManager(baseContext)
        var contactAdapter=ContactAdapter(contactList,baseContext)
        rvcontact.adapter=contactAdapter
    }
}