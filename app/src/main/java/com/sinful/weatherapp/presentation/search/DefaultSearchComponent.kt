package com.sinful.weatherapp.presentation.search

import com.arkivanov.decompose.ComponentContext
import com.sinful.weatherapp.presentation.favourite.FavouriteComponent

class DefaultSearchComponent(
    componentContext: ComponentContext
) : SearchComponent, ComponentContext by componentContext