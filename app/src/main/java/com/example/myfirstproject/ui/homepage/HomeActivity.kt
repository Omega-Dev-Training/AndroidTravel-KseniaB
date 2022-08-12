package com.example.myfirstproject.ui.homepage

import android.annotation.SuppressLint
import android.widget.TextView
import com.example.myfirstproject.R
import com.example.myfirstproject.ui.base.BaseFragment
import com.omegar.mvp.ktx.providePresenter
import java.text.SimpleDateFormat
import java.util.*

open class HomeActivity :  BaseFragment(R.layout.home_page), HomeView{

    companion object {
        private const val MS_PER_MIN = 60000
        private const val MS_PER_HOUR = 60000 * 60
    }

    override val presenter: HomePresenter by providePresenter()

    private val countTime: TextView by bind(R.id.local_time)
    private val countDate: TextView by bind(R.id.date)
    private val selectWeather: TextView by bind(R.id.weather_today)
    private val textCity: TextView by bind(R.id.city)
    private val textCountry: TextView by bind(R.id.country)

    override fun selectTime() {
        val nowTime = Calendar.getInstance()
        val nowHours = nowTime.get(Calendar.HOUR)
        val nowMinutes = nowTime.get(Calendar.MINUTE)

        var format = "${nowHours}:${nowMinutes}"
        format += if(nowHours < 13) {
            "AM"
        } else {
            "PM"
        }
        countTime.text = format
    }

    @SuppressLint("SimpleDateFormat")
    override fun selectDate() {
        val  date = SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().time)
        countDate.text = date
    }

//    @SuppressLint("SetTextI18n")
//    override fun selectWeather() {
//
//        val apiKey = "988745382fce4218a84e3e56a73ae037"
//        val city =  "Italy"
//        val country = "Rome"
//
////        val res = requests.get"http://api.openweathermap.org/data/2.5/find?${city},${country}&type=like&APPID=${apiKey}"
//
//    }
}
