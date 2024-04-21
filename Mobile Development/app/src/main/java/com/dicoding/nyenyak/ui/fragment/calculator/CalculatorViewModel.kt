package com.dicoding.nyenyak.ui.fragment.calculator

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.dicoding.nyenyak.session.DataModel
import com.dicoding.nyenyak.session.SessionPreference

class CalculatorViewModel(private val pref: SessionPreference): ViewModel() {
    fun getToken(): LiveData<DataModel> {
        return pref.getToken().asLiveData()
    }
}