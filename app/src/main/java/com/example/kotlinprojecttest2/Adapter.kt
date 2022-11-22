package com.example.kotlinprojecttest2

import android.util.Log
import com.example.kotlinprojecttest2.data.remote.quest.GetVKJsonResponse
import com.example.kotlinprojecttest2.data.remote.quest.QuestApi
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

//import com.nopalyer.newsapp.Model.Articles
/*
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import org.ocpsoft.prettytime.PrettyTime
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*


class Adapter(var context: Context, arraylist: vkParse) :
    RecyclerView.Adapter<Adapter.ViewHolder>() {

    var arraylist: MutableList<MutableList<String>> = ArrayList()

    init {
        this.arraylist = arraylist.getList()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.items, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val imageUrl: String  = this.arraylist[position + 1]
        val url: String = a.getUrl()
        Picasso.with(context).load(imageUrl).into(holder.imageView)
        holder.Title.setText("Мемы лицея 1523")
        holder.author.setText(imageUrl)
        holder.tvDate.setText("\u2022" + dateTime(a.getPublishedAt()))
        holder.cardView.setOnClickListener {
            val intent = Intent(context, Detailed::class.java)
            intent.putExtra("title", "Мемы лицея 1523")
            intent.putExtra("source", a.getSource().getName())
            intent.putExtra("time", dateTime(a.getPublishedAt()))
            intent.putExtra("desc", a.getDescription())
            intent.putExtra("imageUrl", a.getUrlToImage())
            intent.putExtra("url", a.getUrl())
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return arraylist.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var Title: TextView
        var author: TextView
        var meme_text: TextView
        var imageView: ImageView
        var cardView: CardView

        init {
            Title = itemView.findViewById(R.id.category)
            author = itemView.findViewById(R.id.author)
            meme_text = itemView.findViewById(R.id.meme_text)
            imageView = itemView.findViewById(R.id.image)
            cardView = itemView.findViewById(R.id.cardView)
        }
    }

    fun dateTime(t: String?): String? {
        val prettyTime = PrettyTime(Locale(country))
        var time: String? = null
        try {
            val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:", Locale.ENGLISH)
            val date = simpleDateFormat.parse(t)
            time = prettyTime.format(date)
        } catch (e: ParseException) {
            e.printStackTrace()
        }
        return time
    }

    val country: String
        get() {
            val locale = Locale.getDefault()
            val country = locale.country
            return country.lowercase(Locale.getDefault())
        }


}

 */