package com.zasa.covid19stats.presentation.viewmodel

import androidx.lifecycle.ViewModel

abstract class ViewModel : ViewModel() {

    abstract fun getData()
}