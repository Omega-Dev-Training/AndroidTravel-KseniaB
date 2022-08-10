package com.example.myfirstproject.di

import com.example.myfirstproject.di.modules.ContextModules
import com.google.android.datatransport.runtime.dagger.Component
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        ContextModules::class
    ]
)

interface AppComponent {
}