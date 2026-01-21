package com.sinful.weatherapp.data.mapper

import com.sinful.weatherapp.data.network.dto.CityDto
import com.sinful.weatherapp.domain.entity.City

fun CityDto.toEntity(): City = City(id, name, country)

fun List<CityDto>.toEntities(): List<City> = map { it.toEntity() }