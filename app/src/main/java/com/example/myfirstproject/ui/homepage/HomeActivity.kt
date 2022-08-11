package com.example.myfirstproject.ui.homepage

import android.widget.TextView
import com.example.myfirstproject.R
import com.example.myfirstproject.ui.base.BaseFragment
import com.omega_r.libs.extensions.date.formatToHoursAndMinutes
import com.omegar.mvp.ktx.providePresenter
import java.util.*

open class HomeActivity :  BaseFragment(R.layout.home_page), HomeView{

    companion object {
        private const val MS_PER_MIN = 60000
        private const val MS_PER_HOUR = 60000 * 60
    }

    override val presenter: HomePresenter by providePresenter()

    private val countTime: TextView by bind(R.id.local_time)

    override fun selectTime() {

//        var nowTime = Calendar.getInstance().time.formatToHoursAndMinutes()
        val nowTime = Calendar.getInstance()
        val nowHours = nowTime.get(Calendar.HOUR)
        val nowMinutes = nowTime.get(Calendar.MINUTE)

        var format = "${nowHours}:${nowMinutes}"
        format += if(nowHours < 13) {
            "AM"
        } else {
            "PM"
        }
    }

}
