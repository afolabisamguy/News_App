package com.alphatech.newsapp.data.api

import com.alphatech.newsapp.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {

    @GET("v2/top-headlines")
    suspend fun getNewsHeadline(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String = "f312c2ccc9c64bb5b703226ca2b09d5a"
    ): Response<NewsResponse>

}

