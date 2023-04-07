package com.example.databindingwithlivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

     var quoteslivedata = MutableLiveData("Hello")

    fun upDate(){
       quoteslivedata.value = "You are Welcome"
      }
}