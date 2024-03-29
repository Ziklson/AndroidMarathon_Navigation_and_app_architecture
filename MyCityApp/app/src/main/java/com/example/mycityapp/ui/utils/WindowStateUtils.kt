package com.example.mycityapp.ui.utils

import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass

enum class ContentType {
    ListOnly,
    ListAndDetail
}

fun windowSizeClass(windowSize: WindowWidthSizeClass): ContentType {
    return when (windowSize) {
        WindowWidthSizeClass.Compact -> ContentType.ListOnly
        WindowWidthSizeClass.Expanded -> ContentType.ListAndDetail
        else -> ContentType.ListOnly
    }
}