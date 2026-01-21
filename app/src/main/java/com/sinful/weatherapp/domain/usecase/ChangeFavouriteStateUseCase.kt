package com.sinful.weatherapp.domain.usecase

import com.sinful.weatherapp.domain.entity.City
import com.sinful.weatherapp.domain.repository.FavouriteRepository
import javax.inject.Inject

class ChangeFavouriteStateUseCase @Inject constructor(
    private val repository: FavouriteRepository
) {

    suspend fun addToFavourite(city: City) = repository.addToFavourite(city)

    suspend fun removeFromFavourite(cityId: Int) = repository.removeToFavourite(cityId)
}