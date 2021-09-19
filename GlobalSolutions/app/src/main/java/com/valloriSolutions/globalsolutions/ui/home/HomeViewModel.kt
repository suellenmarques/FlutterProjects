package com.valloriSolutions.globalsolutions.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Bem vindo!"
    }
    val text: LiveData<String> = _text
}