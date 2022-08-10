package com.example.myfirstproject.ui.homepage

import android.system.Os.bind
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstproject.R
import com.example.myfirstproject.ui.base.BaseFragment
import com.example.myfirstproject.ui.base.BasePresenter
import com.example.myfirstproject.ui.base.BaseView
import com.omegar.mvp.ktx.providePresenter
import kotlin.properties.ReadOnlyProperty

open class HomeActivity :  BaseFragment(R.layout.home_page), HomeView{

    override val presenter: HomePresenter by providePresenter()

}