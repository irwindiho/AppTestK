package com.irvinmarin.apps.firstappkotlin.main

import com.irvinmarin.apps.firstappkotlin.model.Persons

/**
 * Created by irvinmarin on 25/10/2018.
 */
interface MainView {
    fun showListPersons(populatePersons: List<Persons>)
}