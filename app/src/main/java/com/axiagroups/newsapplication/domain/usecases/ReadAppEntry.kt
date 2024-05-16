package com.axiagroups.newsapplication.domain.usecases

import com.axiagroups.newsapplication.domain.manager.LocalUserManger
import kotlinx.coroutines.flow.Flow


/**
 * Created by Ahsan Habib on 5/16/2024.
 * shehanuk.ahsan@gmail.com
 */
class ReadAppEntry(
    private val localUserManager: LocalUserManger
) {

    suspend operator fun invoke(): Flow<Boolean> {
        return localUserManager.readEntry()
    }
}