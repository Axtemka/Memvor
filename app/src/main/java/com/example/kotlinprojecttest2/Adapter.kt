package com.example.kotlinprojecttest2

//import com.nopalyer.newsapp.Model.Articles

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


class Adapter(var context_: Context, arraylist: ResponseViewer) :
    RecyclerView.Adapter<Adapter.ViewHolder>() {

    var context: Context? = null
    var arraylist: MutableList<MutableList<String>> = ArrayList()

    init {
        this.context = context_
        this.arraylist = arraylist.getVKList()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.items, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val imageUrl: String  = this.arraylist[position][1]
        val url: String = this.arraylist[position][0]
        Picasso.with(context).load(imageUrl).into(holder.imageView)
        holder.category.text = "Школьный медиаконтент"
        holder.author.text = "Мемы лицея 1523"
        holder.meme_text.text = this.arraylist[position][1]
        holder.cardView.setOnClickListener {
            val intent = Intent(context, Detailed::class.java)
            intent.putExtra("category", "Мемы лицея 1523")
            intent.putExtra("author", "Мемы лицея 1523")
            intent.putExtra("desc", this.arraylist[position][0])
            intent.putExtra("imageUrl", this.arraylist[position][1])
            intent.putExtra("url", this.arraylist[position][0])
            context?.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return arraylist.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var category: TextView
        var author: TextView
        var meme_text: TextView
        var imageView: ImageView
        var cardView: CardView

        init {
            category = itemView.findViewById(R.id.category)
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

