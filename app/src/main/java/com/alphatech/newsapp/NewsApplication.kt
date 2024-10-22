package com.alphatech.newsapp

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class NewsApplication : Application(){

    override fun onCreate() {
        super.onCreate()
        Log.d("NewsApplication", "Coming_inside_onCreate")
    }



}