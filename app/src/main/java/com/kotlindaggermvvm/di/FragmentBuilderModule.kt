package com.kotlindaggermvvm.di

import com.kotlindaggermvvm.ui.fragment.SampleFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuilderModule {

    @ContributesAndroidInjector
    abstract fun contributeSampleFragment(): SampleFragment
}