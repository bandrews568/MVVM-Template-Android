package com.kotlindaggermvvm.ui.fragment

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import com.kotlindaggermvvm.di.Injectable
import com.kotlindaggermvvm.di.ViewModelFactory
import javax.inject.Inject


class SampleFragment : Fragment(), Injectable {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private lateinit var sampleFragmentViewModel: SampleFragmentViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        sampleFragmentViewModel = ViewModelProviders.of(this, viewModelFactory).get(SampleFragmentViewModel::class.java)
    }
}