package com.example.myfirstproject.ui.base

import com.example.myfirstproject.R
import com.example.myfirstproject.application.MyFirstProjectApp
import com.example.myfirstproject.di.AppComponent
import com.omega_r.base.mvp.presenters.OmegaPresenter
import com.omega_r.libs.omegatypes.Text


open class BasePresenter<View : BaseView> : OmegaPresenter<View>(), AppComponent by MyFirstProjectApp.getAppComponent() {

//    //protected
//    fun showComingSoon() {
//        viewState.showToast(Text.from(R.string.message_coming_soon))
//    }

}