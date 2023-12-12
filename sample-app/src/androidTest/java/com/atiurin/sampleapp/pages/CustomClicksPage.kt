package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R
import org.hamcrest.CoreMatchers
import org.hamcrest.Matcher

object CustomClicksPage {
    val square: Matcher<View> by lazy { ViewMatchers.withContentDescription("picture") }
    val topLeftRadioButton: Matcher<View> by lazy { ViewMatchers.withId(R.id.rB_top_left) }
    val topRightRadioButton: Matcher<View> by lazy { ViewMatchers.withId(R.id.rB_top_right) }
    val bottomLeftRadioButton: Matcher<View> by lazy { ViewMatchers.withId(R.id.rB_bottom_left) }
    val bottomRightRadioButton: Matcher<View> by lazy { ViewMatchers.withId(R.id.rB_bottom_right) }


}
