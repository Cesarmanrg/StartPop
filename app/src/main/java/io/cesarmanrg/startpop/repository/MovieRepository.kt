package io.cesarmanrg.startpop.repository

import io.cesarmanrg.startpop.data.model.MovieList

/**
 * Objetivo : Lo que hace un interfez, es define los metodos que se van a utilizar luego
 * en la clase implementadoras.
 */
interface MovieRepository {

    suspend fun getPopularMovies () : MovieList
}