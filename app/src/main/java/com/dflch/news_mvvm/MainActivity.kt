package com.dflch.news_mvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import com.dflch.news_mvvm.ui.theme.News_MVVMTheme
import com.dflch.news_mvvm.presentation.onBoarding.OnBoardingScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        installSplashScreen()

        setContent {
            News_MVVMTheme (dynamicColor = false) {
                Box(modifier = Modifier.background(color = MaterialTheme.colorScheme.background)) {
                        OnBoardingScreen()
                }
            }
        }
    }
}


