package com.irvinmarin.apps.firstappkotlin.main

import com.irvinmarin.apps.firstappkotlin.main.ui.MainActivity

/**
 * Created by irvinmarin on 25/10/2018.
 */
interface MainPresenter {
    fun onCreate()
    fun onStart()
    fun onResume()
    fun onDestroy()
    fun setView(mainActivity: MainActivity)
}