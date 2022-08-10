package com.example.myfirstproject.ui.base

import android.widget.TextView
import com.example.myfirstproject.ui.homepage.HomeActivity
import com.example.myfirstproject.ui.homepage.HomePresenter
import com.omega_r.base.components.OmegaFragment
import kotlin.properties.ReadOnlyProperty

abstract class BaseFragment(contentLayoutId: Int) : OmegaFragment(contentLayoutId), BaseView {

    abstract override val presenter: HomePresenter

}