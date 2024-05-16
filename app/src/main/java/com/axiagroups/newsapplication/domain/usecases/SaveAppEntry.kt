package com.axiagroups.newsapplication.domain.usecases

import com.axiagroups.newsapplication.domain.manager.LocalUserManger


/**
 * Created by Ahsan Habib on 5/16/2024.
 * shehanuk.ahsan@gmail.com
 */
class SaveAppEntry (
    private val localUserManager: LocalUserManger
) {
    suspend operator fun invoke()  { localUserManager.saveAppEntry() }
}