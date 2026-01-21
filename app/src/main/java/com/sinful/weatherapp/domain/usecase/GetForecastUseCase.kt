package com.sinful.weatherapp.domain.usecase

import com.sinful.weatherapp.domain.repository.WeatherRepository
import javax.inject.Inject

class GetForecastUseCase @Inject constructor(
    private val repository: WeatherRepository
) {

   suspend operator fun invoke(cityId: Int) = repository.getForecast(cityId)
}