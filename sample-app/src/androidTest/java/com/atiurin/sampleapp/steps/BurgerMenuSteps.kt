package com.atiurin.sampleapp.steps

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.R
import com.atiurin.sampleapp.helper.tap
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object BurgerMenuSteps {

    fun chooseBurgerMenuOption(menuItemText: String): BurgerMenuSteps {
        val burgerMenuItem: Matcher<View> by lazy {
            Matchers.allOf(
                withId(R.id.design_menu_item_text),
                withText(menuItemText)
            )
        }
        burgerMenuItem.tap()
        return this
    }
}
