package com.kotlindaggermvvm

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.kotlindaggermvvm.ui.activity.SampleActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class SampleActivityTest {

    @get:Rule
    val activityRule = ActivityTestRule(SampleActivity::class.java)

    @Test
    fun helloTextIsShown() {
        onView(withId(R.id.tv_hello_world)).check(matches(isDisplayed()))
    }
}