package com.dflch.news_mvvm.domain.usecases

import com.dflch.news_mvvm.domain.manager.LocalUserManager

class SaveAppEntry (
    private val localUserManager: LocalUserManager
) {

    suspend operator fun invoke() {
        localUserManager.saveAppEntry()
    }
}