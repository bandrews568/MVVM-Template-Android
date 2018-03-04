package com.kotlindaggermvvm.util

import android.app.Activity
import android.app.Application
import com.kotlindaggermvvm.ui.activity.SampleActivity
import com.kotlindaggermvvm.ui.activity.SampleActivityViewModel
import dagger.android.AndroidInjector
import dagger.android.HasActivityInjector
import org.mockito.Mock
import org.mockito.Mockito.mock
import org.mockito.MockitoAnnotations

class TestApp : Application(), HasActivityInjector {

    @Mock lateinit var sampleActivityViewModel: SampleActivityViewModel

    override fun onCreate() {
        super.onCreate()
        MockitoAnnotations.initMocks(this.javaClass)
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return AndroidInjector {
            if (it is SampleActivity) {
                sampleActivityViewModel = mock(SampleActivityViewModel::class.java)
                // View model class must be open to be able to mock
                // Mock functions on the view model here

                it.viewModelFactory = ViewModelUtil.createFor(sampleActivityViewModel)
            }
        }
    }
}