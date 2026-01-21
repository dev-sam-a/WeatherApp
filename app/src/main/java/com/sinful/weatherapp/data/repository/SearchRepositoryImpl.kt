package com.sinful.weatherapp.data.repository

import com.sinful.weatherapp.data.mapper.toEntities
import com.sinful.weatherapp.data.network.api.ApiService
import com.sinful.weatherapp.domain.entity.City
import com.sinful.weatherapp.domain.repository.SearchRepository
import javax.inject.Inject

class SearchRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : SearchRepository {

    override suspend fun search(query: String): List<City> {
        return apiService.searchCity(query).toEntities()
    }
}