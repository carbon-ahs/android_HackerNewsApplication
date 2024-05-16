package com.axiagroups.newsapplication.di

import android.app.Application
import com.axiagroups.newsapplication.data.manager.LocalUserMangerImpl
import com.axiagroups.newsapplication.domain.manager.LocalUserManger
import com.axiagroups.newsapplication.domain.usecases.AppEntryUseCases
import com.axiagroups.newsapplication.domain.usecases.ReadAppEntry
import com.axiagroups.newsapplication.domain.usecases.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


/**
 * Created by Ahsan Habib on 5/16/2024.
 * shehanuk.ahsan@gmail.com
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideLocalUseManager(
        application: Application
    ) : LocalUserManger = LocalUserMangerImpl(application)

    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManger: LocalUserManger
    ) = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManger),
        saveAppEntry = SaveAppEntry(localUserManger)
    )


}