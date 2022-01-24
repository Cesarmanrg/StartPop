package io.cesarmanrg.startpop.repository


import io.cesarmanrg.startpop.data.model.MovieList
import io.cesarmanrg.startpop.data.remote.MovieDataSource


class MovieRepositoryImpl(private val dataSource: MovieDataSource) : MovieRepository {
    override suspend fun getPopularMovies(): MovieList = dataSource.getPopularMovies()

}