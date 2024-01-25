package com.satyamthakur.learning.artspace

import androidx.annotation.DrawableRes

data class ArtImage(
    @DrawableRes val image: Int,
    val artWorkTitle: String,
    val artistAndYear: String
)
