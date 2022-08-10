package com.example.myfirstproject.application

import com.example.myfirstproject.di.AppComponent
import com.example.myfirstproject.di.modules.ContextModules
import com.example.myfirstproject.di.modules.DaggerAppComponent
import com.example.myfirstproject.di.modules.MultiDexApplication


class MyFirstProjectApp: MultiDexApplication() {
    companion object {
        private lateinit var appComponent: AppComponent
        fun getAppComponent() = appComponent
    }

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .contextModule(ContextModules(this))
            .build()
    }

}
