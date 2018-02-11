package com.kotlindaggermvvm.di

import com.kotlindaggermvvm.ui.activity.SampleActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = [FragmentBuilderModule::class])
    abstract fun contributeSampleActivity(): SampleActivity
}