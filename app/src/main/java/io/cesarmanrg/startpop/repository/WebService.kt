package io.cesarmanrg.startpop.repository

import com.google.gson.GsonBuilder
import io.cesarmanrg.startpop.application.AppConstants
import io.cesarmanrg.startpop.data.model.MovieList
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface WebService{

    // Peliculas populares
    @GET("movie/popular")
    // Se utiliza suspend para avisarle a la corrutina que este metodo no se puede utilizar hasta que termine
    suspend fun getPopularMovies(@Query("api_key") apiKey : String, @Query("language") language : String) : MovieList
}
// Creamos un objeto para el cliente retrofit
object RetrofitClient{
    val webservices by lazy {
        Retrofit.Builder()
            .baseUrl(AppConstants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build().create(WebService::class.java)
    }
}