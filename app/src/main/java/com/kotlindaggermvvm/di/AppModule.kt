package com.kotlindaggermvvm.di

import android.content.Context
import com.kotlindaggermvvm.KotlinDaggerMvvmApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [ViewModelModule::class])
class AppModule {

    @Provides
    @Singleton
    fun provideContext(application: KotlinDaggerMvvmApplication): Context = application
}