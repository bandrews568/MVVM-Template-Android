package com.kotlindaggermvvm

import com.kotlindaggermvvm.ui.activity.SampleActivityRepository
import com.kotlindaggermvvm.ui.activity.SampleActivityViewModel
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import kotlin.test.assertEquals


class SampleActivityViewModelTest {

    lateinit var viewModel: SampleActivityViewModel
    lateinit var repository: SampleActivityRepository

    @Before
    fun init() {
        repository = mock(SampleActivityRepository::class.java)
        viewModel = SampleActivityViewModel(repository)
    }

    @Test
    fun correctTextFromRepo() {
        `when`(repository.textFromRepo()).thenReturn("Hello from repo")

        assertEquals("Hello from repo", viewModel.textFromRepo())
    }
}