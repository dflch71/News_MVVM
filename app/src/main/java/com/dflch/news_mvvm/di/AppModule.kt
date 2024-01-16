package com.dflch.news_mvvm.di

import android.app.Application
import com.dflch.news_mvvm.data.manager.LocalUserManagerImpl
import com.dflch.news_mvvm.domain.manager.LocalUserManager
import com.dflch.news_mvvm.domain.usecases.AppEntryUseCases
import com.dflch.news_mvvm.domain.usecases.ReadAppEntry
import com.dflch.news_mvvm.domain.usecases.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocalUserManager(
        application: Application
    ): LocalUserManager = LocalUserManagerImpl(application)

    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManager: LocalUserManager
    ) = AppEntryUseCases (
        readAppEntry = ReadAppEntry(localUserManager),
        saveAppEntry = SaveAppEntry(localUserManager)
    )

}