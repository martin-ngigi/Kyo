package com.vickikbt.domain.models


data class InTheatersMovie(
    val contentRating: String?,

    val directors: String?,

    val fullTitle: String?,

    val genres: String?,

    val id: String?,

    val imDbRating: String?,

    val imDbRatingCount: String?,

    val image: String?,

    val metacriticRating: String?,

    val plot: String?,

    val releaseState: String?,

    val runtimeMins: String?,

    val runtimeStr: String?,

    val starList: List<Star>?,

    val stars: String?,

    val title: String?,

    val year: String?
)
