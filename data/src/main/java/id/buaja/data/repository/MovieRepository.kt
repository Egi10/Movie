package id.buaja.data.repository

import id.buaja.data.entity.MovieResponse
import retrofit2.Response

interface MovieRepository {
    suspend fun getMovie(path: String?, query: Map<String, String>): Response<MovieResponse>
}