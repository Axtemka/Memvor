package com.example.kotlinprojecttest2.db

//constructor(id:String, platform: String, domain: String, name:String, category: String)
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout

class Community constructor(id:String, platform:String, domain:String, name:String, category:String) {
    val id = id
    val platform = platform
    val domain = domain
    val name = name
    val category = category
}