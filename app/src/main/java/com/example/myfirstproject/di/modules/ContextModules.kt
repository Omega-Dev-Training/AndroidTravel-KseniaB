package com.example.myfirstproject.di.modules

import android.content.Context
import com.example.myfirstproject.BuildConfig
import com.google.android.datatransport.runtime.dagger.Module
import com.google.android.datatransport.runtime.dagger.Provides
import javax.inject.Singleton

@Module
class ContextModules(private val context: Context) {
    @Provides
    @Singleton
    fun provideContext() = context

    @Provides
    @Singleton
    fun provideSharePrefs() = context.getSharedPreferences(BuildConfig.APPLICATION_ID, Context.MODE_PRIVATE)


}