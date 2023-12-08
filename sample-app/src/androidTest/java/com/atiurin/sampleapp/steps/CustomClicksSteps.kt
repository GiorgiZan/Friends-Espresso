package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.helper.assertIsViewDisplayed
import com.atiurin.sampleapp.helper.isChecked
import com.atiurin.sampleapp.helper.tap
import com.atiurin.sampleapp.pages.CustomClicksPage
import org.junit.Assert

object CustomClicksSteps {
    fun checkCustomClicksIsOpen(): CustomClicksSteps {
        CustomClicksPage.square.assertIsViewDisplayed()
        return this
    }

    fun clickCornerRadioButtons(): CustomClicksSteps {
        CustomClicksPage.topLeftRadioButton.tap()
        CustomClicksPage.topRightRadioButton.tap()
        CustomClicksPage.bottomLeftRadioButton.tap()
        CustomClicksPage.bottomRightRadioButton.tap()

        return this
    }
    fun checkIfRadioButtonsChecked(): CustomClicksSteps {
        Assert.assertTrue(CustomClicksPage.topLeftRadioButton.isChecked())
        Assert.assertTrue(CustomClicksPage.topRightRadioButton.isChecked())
        Assert.assertTrue(CustomClicksPage.bottomLeftRadioButton.isChecked())
        Assert.assertTrue(CustomClicksPage.bottomRightRadioButton.isChecked())
        return this
    }
}
