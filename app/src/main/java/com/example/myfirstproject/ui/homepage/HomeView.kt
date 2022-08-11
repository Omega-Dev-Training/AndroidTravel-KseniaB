package com.example.myfirstproject.ui.homepage

import com.example.myfirstproject.ui.base.BaseView
import com.omegar.mvp.viewstate.strategy.StateStrategyType
import com.omegar.mvp.viewstate.strategy.StrategyType

interface HomeView: BaseView {
    @StateStrategyType(StrategyType.ADD_TO_END_SINGLE)
    fun selectTime()
    @StateStrategyType(StrategyType.ADD_TO_END_SINGLE)
    fun selectDate()

}