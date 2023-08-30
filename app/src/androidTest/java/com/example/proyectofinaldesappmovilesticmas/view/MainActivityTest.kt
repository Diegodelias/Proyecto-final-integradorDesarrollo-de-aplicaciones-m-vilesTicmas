package com.example.proyectofinaldesappmovilesticmas.view
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.proyectofinaldesappmovilesticmas.R
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @get: Rule
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)
    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }


    @Test
    fun mainActivity_palabrasIguales() {
        Espresso.onView(ViewMatchers.withId(R.id.editText))
            .perform(ViewActions.typeText("bicicleta"), ViewActions.closeSoftKeyboard());

        Espresso.onView(ViewMatchers.withId(R.id.editText2))
            .perform(ViewActions.typeText("bicicleta"), ViewActions.closeSoftKeyboard());


        Espresso.onView(
            ViewMatchers.withId(R.id.button)
        ).perform(
            ViewActions.click()
        )

        Espresso.onView(
            ViewMatchers.withId(R.id.textView)
        ).check(
            ViewAssertions.matches(
                ViewMatchers.withText("son iguales")
            )
        )



    }

    }
