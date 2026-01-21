package com.sinful.weatherapp.domain.repository

import com.sinful.weatherapp.domain.entity.City
import javax.inject.Inject

interface SearchRepository @Inject constructor(

) {

    suspend fun search(query: String): List<City>
}