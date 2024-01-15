package com.dflch.news_mvvm.presentation.onBoarding

import androidx.annotation.DrawableRes
import com.dflch.news_mvvm.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Lorem ipsum is simple dummy",
        description = "Get news from all over the world",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Lorem ipsum is simple dummy",
        description = "Search for news",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Lorem ipsum is simple dummy",
        description = "Saved news",
        image = R.drawable.onboarding3
    )
)
