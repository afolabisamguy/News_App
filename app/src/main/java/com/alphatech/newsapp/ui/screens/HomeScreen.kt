package com.alphatech.newsapp.ui.screens

import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.alphatech.newsapp.Utilities.ResourceState
import com.alphatech.newsapp.ui.viewmodel.NewsViewModel

//@Composable
//fun HomeScreen(
//    newsViewModel: NewsViewModel = hiltViewModel()
//){
//    val newsRes = newsViewModel.news.collectAsState()
//
//    Surface(
//        modifier = Modifier.fillMaxSize(),
//    ) {
//
//        when(newsRes){
//            is ResourceState.Loading -> {
//                Log.d("HomeScreen", "Inside_Loading")
//            }
//
//            is ResourceState.Success -> {
//                Log.d("HomeScreen", "Inside_Success")
//
//            }
//
//            is ResourceState.Error -> {
//                Log.d("HomeScreen", "Inside_Error")
//
//            }
//        }
//
//    }
//}