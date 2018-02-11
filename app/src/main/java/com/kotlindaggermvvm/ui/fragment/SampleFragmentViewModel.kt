package com.kotlindaggermvvm.ui.fragment

import android.arch.lifecycle.ViewModel
import javax.inject.Inject


class SampleFragmentViewModel @Inject constructor(private val sampleFragmentRepository: SampleFragmentRepository) : ViewModel() {
}