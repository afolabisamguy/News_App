package com.alphatech.newsapp.ui.repository

import com.alphatech.newsapp.Utilities.ResourceState
import com.alphatech.newsapp.data.datasource.NewsDataSource
import com.alphatech.newsapp.data.entity.NewsResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class NewsRepository @Inject constructor(
    private val newsDataSource: NewsDataSource
){
//    suspend fun getNewsHeadline(country:String): Response<NewsResponse>{
//        return newsDataSource.getNewsHeadLine(country)
//    }

    suspend fun getNewsHeadline(country:String): Flow<ResourceState<NewsResponse>> {
        return flow {
//            emit(ResourceState.Loading())
            val response =  newsDataSource.getNewsHeadline(country)
            if(response.isSuccessful && response.body() != null){
                emit(ResourceState.Success(response.body()!!))
            }
            else{
//                emit(ResourceState.Error("Something went wrong while getting news"))
            }
        }.catch {e ->
//            emit(ResourceState.Error(e.message.toString()))

        }
    }
}