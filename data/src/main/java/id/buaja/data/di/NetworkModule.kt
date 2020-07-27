package id.buaja.data.di

import id.buaja.data.routes.MoviesService
import id.buaja.network.Network
import org.koin.dsl.module

val networkModule = module {
    single {
        Network.retrofitClient<MoviesService>()
    }
}