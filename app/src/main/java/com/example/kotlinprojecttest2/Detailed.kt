package com.example.kotlinprojecttest2

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso


class Detailed : AppCompatActivity() {
    var category: TextView? = null
    var author: TextView? = null
    var meme_text: TextView? = null
    var Desc: TextView? = null
    var imageView: ImageView? = null
    var webView: WebView? = null
    var loader: ProgressBar? = null
    @SuppressLint("MissingInflatedId", "SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)
        category = findViewById(R.id.category)
        author = findViewById(R.id.author)
        meme_text = findViewById(R.id.meme_text)
        Desc = findViewById(R.id.vkDesc)
        imageView = findViewById(R.id.imageView)
        webView = findViewById(R.id.webView)
        loader = findViewById(R.id.webViewLoader)
        loader?.visibility = View.VISIBLE
        val intent = intent
        val title = intent.getStringExtra("title")
        val source = intent.getStringExtra("source")
        val time = intent.getStringExtra("time")
        val desc = intent.getStringExtra("desc")
        val imageUrl = intent.getStringExtra("imageUrl")
        val url = intent.getStringExtra("url")
        category?.text = title
        author?.text = source
        meme_text?.text = time
        Desc?.text = desc
        Picasso.with(this@Detailed).load(imageUrl).into(imageView)
        webView?.settings?.domStorageEnabled = true
        webView?.settings?.javaScriptEnabled = true
        webView?.settings?.loadsImagesAutomatically = true
        webView?.scrollBarStyle = View.SCROLLBARS_INSIDE_OVERLAY
        webView?.webViewClient = WebViewClient()
        webView?.loadUrl(url!!)
        if (webView?.isShown == true) {
            loader?.visibility = View.INVISIBLE
        }
    }
}