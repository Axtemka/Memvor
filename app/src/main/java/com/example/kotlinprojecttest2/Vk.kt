package com.example.kotlinprojecttest2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView


import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import android.app.Dialog
import android.widget.Button
import android.widget.ProgressBar
import android.widget.Toast

import com.example.kotlinprojecttest2.Model.Articles
import com.example.kotlinprojecttest2.Model.Headlines

import java.util.ArrayList
import java.util.Locale

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class Vk : Fragment() {
    var recyclerView: RecyclerView? = null
    //var swipeRefreshLayout: SwipeRefreshLayout? = null
    var etQuery: EditText? = null
    var btnSearch: Button? = null
    var btnAboutUs: Button? = null
    var dialog: Dialog? = null
    val API_KEY = "YOUR API KEY"
    var adapter: Adapter? = null
    var articles: List<Articles> = ArrayList()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_vk, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = Vk()
    }
}