package com.sinful.weatherapp.presentation.ui.theme

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

data class Gradient(
    val primaryGradient: Brush,
    val secondaryGradient: Brush,
    val shadowColor: Color
){

    constructor(
        firstColor: Color,
        secondColor: Color,
        thirdColor: Color,
        fourthColor: Color,
    ): this(
        primaryGradient = Brush.linearGradient(listOf(firstColor, secondColor)),
        secondaryGradient = Brush.linearGradient(listOf(thirdColor, fourthColor)),
        shadowColor = fourthColor
    )
}

object CardGradients {
    val gradients = listOf(

        // Тёплый персиково-оранжевый
        Gradient(
            firstColor = Color(0xFFE07A5F),
            secondColor = Color(0xFFC8553D),
            thirdColor = Color(0xFFB84A32),
            fourthColor = Color(0xFF8F3A2A),
        ),

        // Фиолетово-синий
        Gradient(
            firstColor = Color(0xFF6A5ACD),
            secondColor = Color(0xFF4B3FAD),
            thirdColor = Color(0xFF3A2F8F),
            fourthColor = Color(0xFF2C246D),
        ),

        // Мятно-зелёный, без неона
        Gradient(
            firstColor = Color(0xFF4CAF8E),
            secondColor = Color(0xFF2E8B74),
            thirdColor = Color(0xFF24705E),
            fourthColor = Color(0xFF1B5648),
        ),

        // Голубой → индиго
        Gradient(
            firstColor = Color(0xFF4A90E2),
            secondColor = Color(0xFF357ABD),
            thirdColor = Color(0xFF2A5F94),
            fourthColor = Color(0xFF1F456B),
        ),

        // Розово-сливовый
        Gradient(
            firstColor = Color(0xFFB565A7),
            secondColor = Color(0xFF8E4A8A),
            thirdColor = Color(0xFF6F3A6C),
            fourthColor = Color(0xFF51284F),
        )
    )
}
