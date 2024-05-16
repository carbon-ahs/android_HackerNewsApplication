package com.axiagroups.newsapplication.domain.manager

import kotlinx.coroutines.flow.Flow


/**
 * Created by Ahsan Habib on 5/16/2024.
 * shehanuk.ahsan@gmail.com
 */
interface LocalUserManger {
    suspend fun saveAppEntry()
    fun readEntry(): Flow<Boolean>

}