package com.kotlindaggermvvm.ui.activity

import javax.inject.Inject

class SampleActivityRepository @Inject constructor() {

    fun textFromRepo() = "Hello from repo"
}