package io.cesarmanrg.startpop.data.remote

import io.cesarmanrg.startpop.application.AppConstants
import io.cesarmanrg.startpop.data.model.MovieList
import io.cesarmanrg.startpop.repository.WebService

class MovieDataSource(private val webService: WebService)  {

    suspend fun getPopularMovies() : MovieList = webService.getPopularMovies(AppConstants.API_KEY, AppConstants.LANGUAGE)
}