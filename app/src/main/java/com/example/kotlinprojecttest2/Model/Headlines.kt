package com.example.kotlinprojecttest2.Model
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Headlines {
    @SerializedName("status")
    @Expose
    private var status: String? = null

    @SerializedName("totalResults")
    @Expose
    private var totalResults: String? = null

    @SerializedName("articles")
    @Expose
    private var articles: List<Articles?>? = null

    fun getStatus(): String? {
        return status
    }

    fun setStatus(status: String?) {
        this.status = status
    }

    fun getTotalResults(): String? {
        return totalResults
    }

    fun setTotalResults(totalResults: String?) {
        this.totalResults = totalResults
    }

    fun getArticles(): List<Articles?>? {
        return articles
    }

    fun setArticles(articles: List<Articles?>?) {
        this.articles = articles
    }
}