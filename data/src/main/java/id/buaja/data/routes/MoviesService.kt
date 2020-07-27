package id.buaja.data.routes

import id.buaja.data.entity.MovieResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface MoviesService {
    @GET("movie/{path}")
    suspend fun getMovie(
        @Path("path") path: String?,
        @QueryMap query: Map<String, String>
    ): Response<MovieResponse>
}