package com.estudokotlin.ktmvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var mRepository = PersonRepository()


    private var mTextWelcome = MutableLiveData<String>() //.apply { value = "Olá MVVM!" }
    var textWelcome = mTextWelcome

    private var mLogin = MutableLiveData<Boolean>()
    var login = mLogin

    init {
        mTextWelcome.value =" Olá MVVM"
    }

    fun login(login: String){
        val retorno = mRepository.login(login)
        mLogin.value = retorno
    }
}