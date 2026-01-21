package com.sinful.weatherapp.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.lifecycleScope
import com.sinful.weatherapp.data.network.api.ApiFactory
import com.sinful.weatherapp.data.network.api.ApiService
import com.sinful.weatherapp.presentation.ui.theme.WeatherAppTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val apiService = ApiFactory.apiService
        lifecycleScope.launch {
            val result = withContext(Dispatchers.IO) {
                val current = apiService.loadCurrentWeather("London")
                val forecast = apiService.loadForecast("London")
                val cities = apiService.searchCity("London")
                Triple(current, forecast, cities)
            }

            Log.d("MainActivity", result.toString())
        }

        setContent {
            WeatherAppTheme {

            }
        }
    }
}