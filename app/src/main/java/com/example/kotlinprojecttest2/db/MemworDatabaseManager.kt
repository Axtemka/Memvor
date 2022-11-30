package com.example.kotlinprojecttest2.db

import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
//////opapopa

class MemworDatabaseManager {
    private lateinit var db: DatabaseReference
    val COMMUNITY_KEY: String = "Community"

    fun databaseInit(){
        db = FirebaseDatabase.getInstance().getReference(COMMUNITY_KEY)
    }

    fun addNewCommunity(platform: String, domain: String, name: String, category: String){
        val id = db.key.toString()
        val newCommunity =  Community(id, platform, domain, name, category)
        db.push().setValue(newCommunity)
    }
}