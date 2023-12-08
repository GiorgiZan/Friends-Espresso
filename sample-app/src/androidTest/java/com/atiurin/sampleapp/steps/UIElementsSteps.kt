package com.atiurin.sampleapp.steps

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isNotChecked
import com.atiurin.sampleapp.helper.assertIfViewIsNotDisplayed
import com.atiurin.sampleapp.helper.assertIsViewDisplayed
import com.atiurin.sampleapp.helper.tap
import com.atiurin.sampleapp.pages.UiElementsPage

object UIElementsSteps {
    fun checkUIElementsPageIsOpen(): UIElementsSteps {
        UiElementsPage.contentDesc.assertIsViewDisplayed()
        UiElementsPage.appCompactText.assertIsViewDisplayed()
        return this
    }

    fun clickEnableCheckbox(): UIElementsSteps {
        UiElementsPage.enableCheckbox.tap()
        return this
    }

    fun clickClickableCheckbox(): UIElementsSteps {
        UiElementsPage.clickableCheckbox.tap()
        return this
    }

    fun clickInvisibleRadioButton(): UIElementsSteps {
        UiElementsPage.invisibleRadioButton.tap()
        return this
    }

    fun isEnableCheckboxChecked(): UIElementsSteps {
        onView(UiElementsPage.enableCheckbox).check(matches(isNotChecked()))
        return this
    }

    fun isClickableCheckboxChecked(): UIElementsSteps {
        onView(UiElementsPage.clickableCheckbox).check(matches(isNotChecked()))
        return this
    }

    fun checkButton1IsInvisible(): UIElementsSteps {
        UiElementsPage.button1.assertIfViewIsNotDisplayed()
        return this
    }
}
