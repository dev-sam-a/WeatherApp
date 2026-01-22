package com.sinful.weatherapp.di

import android.content.Context
import com.sinful.weatherapp.data.local.db.FavouriteCitiesDao
import com.sinful.weatherapp.data.local.db.FavouriteDatabase
import com.sinful.weatherapp.data.network.api.ApiFactory
import com.sinful.weatherapp.data.network.api.ApiService
import com.sinful.weatherapp.data.repository.FavouriteRepositoryImpl
import com.sinful.weatherapp.data.repository.SearchRepositoryImpl
import com.sinful.weatherapp.data.repository.WeatherRepositoryImpl
import com.sinful.weatherapp.domain.repository.FavouriteRepository
import com.sinful.weatherapp.domain.repository.SearchRepository
import com.sinful.weatherapp.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
interface DataModule {

    @[ApplicationScope Binds]
    fun bindFavouriteRepository(impl: FavouriteRepositoryImpl): FavouriteRepository

    @[ApplicationScope Binds]
    fun bindWeatherRepository(impl: WeatherRepositoryImpl): WeatherRepository

    @[ApplicationScope Binds]
    fun bindSearchRepository(impl: SearchRepositoryImpl): SearchRepository

    companion object {

        @[ApplicationScope Provides]
        fun provideApiService(): ApiService = ApiFactory.apiService

        @[ApplicationScope Provides]
        fun provideFavouriteDatabase(context: Context): FavouriteDatabase {
            return FavouriteDatabase.getInstance(context)
        }

        @[ApplicationScope Provides]
        fun provideFavouriteCitiesDao(database: FavouriteDatabase): FavouriteCitiesDao {
            return database.favouriteCitiesDao()
        }
    }
}