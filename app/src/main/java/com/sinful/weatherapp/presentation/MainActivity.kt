package com.sinful.weatherapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.arkivanov.decompose.defaultComponentContext
import com.sinful.weatherapp.WeatherApp
import com.sinful.weatherapp.presentation.root.DefaultRootComponent
import com.sinful.weatherapp.presentation.root.RootContent
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    @Inject
    lateinit var rootComponentFactory: DefaultRootComponent.Factory


    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as WeatherApp).applicationComponent.inject(this)

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val root = rootComponentFactory.create(defaultComponentContext())
        setContent {
            RootContent(root)
        }
    }
}