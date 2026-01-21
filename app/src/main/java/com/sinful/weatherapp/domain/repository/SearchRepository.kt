package com.sinful.weatherapp.domain.repository

import com.sinful.weatherapp.domain.entity.City

interface SearchRepository {

    suspend fun search(query: String): List<City>
}