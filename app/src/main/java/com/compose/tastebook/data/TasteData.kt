package com.compose.tastebook.data

import androidx.compose.runtime.Immutable

@Immutable
data class TasteData(
    val image: String,
    val title: String,
    val date: String,
    val rating: Int
)
