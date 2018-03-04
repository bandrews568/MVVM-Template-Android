package com.kotlindaggermvvm

import android.support.test.espresso.Espresso
import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.kotlindaggermvvm.ui.fragment.SampleFragment
import com.kotlindaggermvvm.ui.fragment.SampleFragmentViewModel
import com.kotlindaggermvvm.util.SingleFragmentActivity
import com.kotlindaggermvvm.util.ViewModelUtil
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.mock

@RunWith(AndroidJUnit4::class)
class SampleFragmentTest {

    @get:Rule
    val activityRule = ActivityTestRule(SingleFragmentActivity::class.java)

    @Before
    fun init() {
        val viewModel = mock(SampleFragmentViewModel::class.java)
        val viewModelFactory = ViewModelUtil.createFor(viewModel)

        val sampleFragment = SampleFragment()
        sampleFragment.viewModelFactory = viewModelFactory

        activityRule.activity.setFragment(sampleFragment)
    }

    @Test
    fun helloFromFragmentTextIsShown() {
        Espresso.onView(ViewMatchers.withId(R.id.text_sample_fragment)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}