package io.cesarmanrg.startpop.data.model

import com.google.gson.annotations.SerializedName

data class MovieDetail(
    val adult: Boolean = false,
    @SerializedName("backdrop_path")
    val backdropPath: String = "",
    @SerializedName("belongs_to_collection")
    val belongsToCollection: List<String> = listOf(),
    val budget: Long = -1,
    val genres: List<String> = listOf(),
    val homepage: String = "",
    val id: Int = -1,
    @SerializedName("imdb_id")
    val imdbId: String = "",
    @SerializedName("original_language")
    val originalLanguage: String = "",
    @SerializedName("original_title")
    val originalTitle: String = "",
    val overview: String = "",
    val popularity: Double = -1.0,
    @SerializedName("poster_path")
    val posterPath: List<String> = listOf(),
    @SerializedName("production_countries")
    val productionCountries: List<String> = listOf(),
    val status: String = "",
    val tagline: String = "",
    val title: String = "",
    val video: Boolean = false,
    @SerializedName("vote_average")
    val voteAverage: Double = -1.0,
    @SerializedName("vote_count")
    val voteCount: Int = -1


)
