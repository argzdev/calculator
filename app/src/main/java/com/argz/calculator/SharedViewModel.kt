package com.argz.calculator

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {

    private val _total = MutableLiveData(0.0)
    val total: LiveData<String> = Transformations.map(_total) {
        "$it"
    }

    fun sumTotal(firstNumber: String, secondNumber: String){
        if(firstNumber.isNotEmpty() && secondNumber.isNotEmpty()){
            var sum = firstNumber.toDouble() + secondNumber.toDouble()
            _total.value = sum
        }
    }
}