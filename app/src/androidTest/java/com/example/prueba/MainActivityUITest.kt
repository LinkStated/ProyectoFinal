package com.example.prueba

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test

@LargeTest
class MainActivityUITest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testCompareButton() {
        val text1 = "Hello"
        val text2 = "Hello"

        Espresso.onView(ViewMatchers.withId(R.id.editText1)).perform(ViewActions.typeText(text1))
        Espresso.onView(ViewMatchers.withId(R.id.editText2)).perform(ViewActions.typeText(text2))

        Espresso.onView(ViewMatchers.withId(R.id.compareButton)).perform(ViewActions.click())

        Thread.sleep(1000)

        Espresso.onView(ViewMatchers.withId(R.id.resultTextView))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.resultadoIguales)))
    }
}