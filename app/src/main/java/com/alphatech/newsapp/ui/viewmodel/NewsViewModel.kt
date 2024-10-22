package com.alphatech.newsapp.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alphatech.newsapp.Utilities.ResourceState
import com.alphatech.newsapp.data.AppConstants
import com.alphatech.newsapp.data.entity.NewsResponse
import com.alphatech.newsapp.ui.repository.NewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(
    private val newsRepository: NewsRepository
) : ViewModel() {

//    private val _news : MutableStateFlow<ResourceState<NewsResponse>> =
//        MutableStateFlow()
//    val news : StateFlow<ResourceState<NewsResponse>> = _news

    init{
        getNews(AppConstants.COUNTRY)
    }
    fun getNews(country: String){
        viewModelScope.launch (Dispatchers.IO){
            newsRepository.getNewsHeadline(country)
                .collectLatest {newsResponse ->
//                    _news.value = newsResponse
                }
        }
    }


}