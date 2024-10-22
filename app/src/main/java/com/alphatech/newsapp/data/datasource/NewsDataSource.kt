package com.alphatech.newsapp.data.datasource

import com.alphatech.newsapp.data.entity.NewsResponse
import retrofit2.Response

interface NewsDataSource {

    suspend fun getNewsHeadline(country: String) : Response<NewsResponse>
}