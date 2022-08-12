package com.example.myfirstproject.application

import android.app.Application
import com.example.myfirstproject.di.AppComponent
import com.example.myfirstproject.di.modules.ContextModules


class MyFirstProjectApp: Application() {
    companion object {
        private lateinit var appComponent: AppComponent
        fun getAppComponent() = appComponent
    }

    override fun onCreate() {
        super.onCreate()
//        appComponent = DaggerAppComponent.builder()
//            .contextModule(ContextModules(this))
//            .build()
    }

}
