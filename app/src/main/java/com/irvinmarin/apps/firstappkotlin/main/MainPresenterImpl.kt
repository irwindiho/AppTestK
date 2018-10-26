package com.irvinmarin.apps.firstappkotlin.main

import com.irvinmarin.apps.firstappkotlin.model.Persons

/**
 * Created by irvinmarin on 25/10/2018.
 */
class MainPresenterImpl(private val view: MainView? = null) : MainPresenter {


    override fun onCreate() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onStart() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onResume() {
        if (view != null) this.view.showListPersons(populatePersons())
    }

    private fun populatePersons(): List<Persons> {
        val personlist: MutableList<Persons> = mutableListOf()
        personlist.add(Persons("Irvin", "Marin", "47717813"))
        personlist.add(Persons("Jose", "Arias", "47717813"))
        personlist.add(Persons("Kelvin", "Meza", "47717813"))
        personlist.add(Persons("Hector", "Mamani", "47717813"))
        personlist.add(Persons("Aron", "Zarate", "47717813"))
        return personlist
    }

    override fun onDestroy() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}