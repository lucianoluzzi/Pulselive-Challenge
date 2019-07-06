package br.com.lucianoluzzi.pulselivechallenge.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class WebClient {
    companion object {
        const val HOST = "http://dynamic.pulselive.com"
    }

    private val retrofit: Retrofit = retrofit()
    private fun retrofit() = with(Retrofit.Builder()) {
        baseUrl(HOST)
        addConverterFactory(GsonConverterFactory.create())
        build()
    }

    fun service(): ArticleService = retrofit.create(ArticleService::class.java)
}
