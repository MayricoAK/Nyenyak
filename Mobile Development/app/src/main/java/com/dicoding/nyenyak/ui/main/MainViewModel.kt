package com.dicoding.nyenyak.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.dicoding.nyenyak.data.repository.AppRepository
import com.dicoding.nyenyak.session.DataModel
import com.dicoding.nyenyak.session.SessionPreference
import kotlinx.coroutines.launch

class MainViewModel(private val pref: SessionPreference): ViewModel() {
    fun gettoken(): LiveData<DataModel> {
        return pref.getToken().asLiveData()
    }
}