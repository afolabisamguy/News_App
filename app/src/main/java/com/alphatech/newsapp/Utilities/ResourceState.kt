package com.alphatech.newsapp.Utilities

sealed class ResourceState < out T> {

    data object Loading : ResourceState<Nothing>()

    data class Success<T>(val data: T) : ResourceState<T>()

    data class Error<T>(val error: String) : ResourceState<Nothing>()
}