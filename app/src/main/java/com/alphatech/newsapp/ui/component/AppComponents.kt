package com.alphatech.newsapp.ui.component

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Loader(){
    CircularProgressIndicator(
        modifier = Modifier
            .size(50.dp)
            .padding(16.dp),
        color = Color.White
    )
}