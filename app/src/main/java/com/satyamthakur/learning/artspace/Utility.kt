@file:Suppress("IMPLICIT_CAST_TO_ANY")

package com.satyamthakur.learning.artspace

fun artworkFromNum(num: Int): ArtImage {
    val image = when (num) {
        1 -> ArtImage(R.drawable.starry_night, "Starry Night",
            "Vincent van Gogh (1889)")

        2 -> ArtImage(R.drawable.thekiss, "The Kiss", "Gustav Klimt (1908)")

        3 -> ArtImage(R.drawable.the_girl_with_pearl_earring, "Girl with a Pearl Earring",
            "Johannes Vermeer (1665)")

        4 -> ArtImage(R.drawable.adele_block, "Adele Bloch-Bauer I",
            "Gustav Klimt (1907)")

        else -> ArtImage(R.drawable.mona_lisa, "Mona Lisa",
            "Leonardo da Vinci (1506)")
    }

    return image
}

