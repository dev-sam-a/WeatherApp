package com.sinful.weatherapp.presentation.root

import com.arkivanov.decompose.ComponentContext
import com.sinful.weatherapp.presentation.favourite.FavouriteComponent

class DefaultRootComponent(
    componentContext: ComponentContext
) : RootComponent, ComponentContext by componentContext