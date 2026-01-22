package com.sinful.weatherapp

import android.app.Application
import com.sinful.weatherapp.di.ApplicationComponent
import com.sinful.weatherapp.di.DaggerApplicationComponent

class WeatherApp : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.factory().create(this)
    }
}