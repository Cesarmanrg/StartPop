package io.cesarmanrg.startpop.data.model

import com.google.gson.annotations.SerializedName

/**
 * Objetivo : La clase del Modelo Movies, nos va a servir para ir a traer la informaciôn del servidor
 */
data class Movie(
    val id : Int = -1,
    val adult : Boolean = false,
    @SerializedName("backdrop_path")
    val backdropPath : String = "",
    @SerializedName("genre_ids")
    val genreIds : List<Int> = listOf(),
    @SerializedName("original_language")
    val originalLanguage : String = "",
    @SerializedName("original_title")
    val originalTitle : String = "",
    val overview : String = "",
    val popularity : Double = -1.0,
    @SerializedName("poster_path")
    val posterPath : String = "",
    @SerializedName("release_date")
    val releaseDate : String = "",
    val title : String = "",
    val video : Boolean = false,
    @SerializedName("vote_average")
    val voteAverage : Double = -1.0,
    @SerializedName("vote_count")
    val voteCount : Int = -1)


data class MovieList(val results: List<Movie> = listOf())
