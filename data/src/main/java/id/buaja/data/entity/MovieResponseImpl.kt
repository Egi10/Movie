package id.buaja.data.entity

import id.buaja.data.repository.MovieRepository
import retrofit2.Response

class MovieResponseImpl : MovieRepository {
    override suspend fun getMovie(
        path: String?,
        query: Map<String, String>
    ): Response<MovieResponse> {
        TODO("Not yet implemented")
    }
}