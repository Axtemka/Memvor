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

    fun addNewCommunity(){
        val id = db.key.toString()
        val platform = "test_platform"
        val domain = "test_domain"
        val name = "test_name"
        val category = "test_category"
        val newCommunity =  Community(id, platform, domain, name, category)
        db.push().setValue(newCommunity)
    }
}