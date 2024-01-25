package com.satyamthakur.learning.artspace

fun imageFromNumber(num: Int): Int {
    val image = when (num) {
        1 -> R.drawable.starry_night
        2 -> R.drawable.thekiss
        3 -> R.drawable.the_girl_with_pearl_earring
        4 -> R.drawable.adele_block
        else -> R.drawable.mona_lisa
    }

    return image
}