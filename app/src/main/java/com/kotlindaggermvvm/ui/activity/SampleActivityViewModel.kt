package com.kotlindaggermvvm.ui.activity

import android.arch.lifecycle.ViewModel
import javax.inject.Inject


class SampleActivityViewModel @Inject constructor(private val sampleActivityRepository: SampleActivityRepository): ViewModel() {

}