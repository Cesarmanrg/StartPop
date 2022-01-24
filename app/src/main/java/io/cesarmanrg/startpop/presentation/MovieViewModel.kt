package io.cesarmanrg.startpop.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import io.cesarmanrg.startpop.core.Resource

import io.cesarmanrg.startpop.repository.MovieRepository
import kotlinx.coroutines.Dispatchers
import java.lang.Exception


class MovieViewModel(private val repo: MovieRepository) : ViewModel(){


    fun fetchMainScreenMovies() = liveData(Dispatchers.IO) {
        // Estado de carga
        emit(Resource.Loading())

        // Llamada al servidor
        try {
            // Estado de exito
            emit(Resource.Success(repo.getPopularMovies()))
        }catch (e : Exception){
            // Estado de fallo
            emit(Resource.Failure(e))
        }
    }


}

class MovieViewModelFactory(private val repo: MovieRepository) : ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
       return modelClass.getConstructor(MovieRepository::class.java).newInstance(repo)
    }

}