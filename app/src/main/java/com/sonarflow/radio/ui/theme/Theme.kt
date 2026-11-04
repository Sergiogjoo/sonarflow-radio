package com.sonarflow.radio.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Paleta premium oscura
val DeepBlack = Color(0xFF0A0A0F)
val SurfaceDark = Color(0xFF12121A)
val CardDark = Color(0xFF1A1A24)
val AccentPurple = Color(0xFF8B5CF6)
val AccentCyan = Color(0xFF22D3EE)
val AccentPink = Color(0xFFEC4899)
val TextPrimary = Color(0xFFF8FAFC)
val TextSecondary = Color(0xFF94A3B8)

private val DarkColorScheme = darkColorScheme(
    primary = AccentPurple,
    secondary = AccentCyan,
    tertiary = AccentPink,
    background = DeepBlack,
    surface = SurfaceDark,
    surfaceVariant = CardDark,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = TextPrimary,
    onSurface = TextPrimary,
    onSurfaceVariant = TextSecondary
)

@Composable
fun SonarflowTheme(
    darkTheme: Boolean = true, // Forzamos tema oscuro premium
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = DarkColorScheme,
        content = content
    )
}
