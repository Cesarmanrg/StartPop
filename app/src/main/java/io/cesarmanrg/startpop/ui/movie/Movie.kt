package io.cesarmanrg.startpop.ui.movie

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import io.cesarmanrg.startpop.R
import io.cesarmanrg.startpop.core.Resource
import io.cesarmanrg.startpop.data.remote.MovieDataSource
import io.cesarmanrg.startpop.databinding.FragmentMovieBinding
import io.cesarmanrg.startpop.presentation.MovieViewModel
import io.cesarmanrg.startpop.presentation.MovieViewModelFactory
import io.cesarmanrg.startpop.repository.MovieRepositoryImpl
import io.cesarmanrg.startpop.repository.RetrofitClient

class Movie : Fragment(R.layout.fragment_movie) {

    private lateinit var binding : FragmentMovieBinding
    private val viewModel by viewModels<MovieViewModel> {
        MovieViewModelFactory(MovieRepositoryImpl(MovieDataSource(RetrofitClient.webservices)))
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMovieBinding.bind(view)

        viewModel.fetchMainScreenMovies().observe(viewLifecycleOwner, { result ->

            when(result){
                is Resource.Loading -> {
                    Log.d("LiveData", "Cargando")
                }
                is Resource.Success -> {
                    Log.d("LiveData", "${result.data}")
                }
                is Resource.Failure -> {
                    Log.d("LiveData", "${result.exception}")
                }
            }

        })
    }
}