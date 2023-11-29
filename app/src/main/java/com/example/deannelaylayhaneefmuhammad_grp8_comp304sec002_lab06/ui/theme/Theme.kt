package com.example.deannelaylayhaneefmuhammad_grp8_comp304sec002_lab06.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200
)

private val LightColorPalette = lightColors(
    primary = Color(0xFF1976D2), // Royal Blue
    primaryVariant = Color(0xFF004BA0), // Darker shade of Royal Blue
    secondary = Color(0xFF00BCD4), // Cyan
    background = Color(0xFFF5F5F5), // Light Gray
    surface = Color.White, // White surface
    onPrimary = Color.White, // White text on Royal Blue
    onSecondary = Color.Black, // Black text on Cyan
    onBackground = Color.Black, // Black text on Light Gray background
    onSurface = Color.Black // Black text on White surface
)

@Composable
fun DeanneLaylayHaneefMuhammad_Grp8_COMP304Sec002_Lab06Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}