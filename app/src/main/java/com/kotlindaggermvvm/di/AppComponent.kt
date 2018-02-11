package com.kotlindaggermvvm.di

import com.kotlindaggermvvm.KotlinDaggerMvvmApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class,
                      AndroidSupportInjectionModule::class,
                      ActivityBuilderModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance fun application(kotlinDaggerMvvmApplication: KotlinDaggerMvvmApplication): Builder
        fun build(): AppComponent
    }

    fun inject(app: KotlinDaggerMvvmApplication)
}