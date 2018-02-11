package com.kotlindaggermvvm.di

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.kotlindaggermvvm.ui.activity.SampleActivityViewModel
import com.kotlindaggermvvm.ui.fragment.SampleFragmentViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(SampleActivityViewModel::class)
    abstract fun bindSampleActivityViewModel(sampleActivityViewModel: SampleActivityViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(SampleFragmentViewModel::class)
    abstract fun bindSampleFragmentViewModel(sampleFragmentViewModel: SampleFragmentViewModel): ViewModel
}