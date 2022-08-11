package com.example.myfirstproject.ui.homepage

import com.omega_r.base.mvp.presenters.OmegaPresenter

class HomePresenter: OmegaPresenter<HomeView>() {
    init {
        viewState.selectTime()
    }
}