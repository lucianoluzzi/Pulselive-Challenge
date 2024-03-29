package br.com.lucianoluzzi.pulselivechallenge.network

import br.com.lucianoluzzi.pulselivechallenge.model.dto.ArticleResponse
import br.com.lucianoluzzi.pulselivechallenge.model.dto.ArticlesSummaryResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ArticleService {
    @GET("test/native/contentList.json")
    fun fetchArticlesSummary(): Call<ArticlesSummaryResponse>

    @GET("test/native/content/{id}.json")
    fun fetchArticle(@Path("id") id: String): Call<ArticleResponse>
}