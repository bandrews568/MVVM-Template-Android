package com.kotlindaggermvvm.ui.activity

import android.arch.lifecycle.ViewModel
import javax.inject.Inject


open class SampleActivityViewModel @Inject constructor(private val sampleActivityRepository: SampleActivityRepository): ViewModel() {

    fun textFromRepo() = sampleActivityRepository.textFromRepo()
}