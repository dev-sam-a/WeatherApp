package com.sinful.weatherapp.domain.repository

import com.sinful.weatherapp.domain.entity.Forecast
import com.sinful.weatherapp.domain.entity.Weather

interface WeatherRepository {

    suspend fun getWeather(cityId: Int): Weather

    suspend fun getForecast(cityId: Int): Forecast


}