package com.atiurin.sampleapp.tests.espresso

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.data.Data
import com.atiurin.sampleapp.steps.BurgerMenuSteps
import com.atiurin.sampleapp.steps.ChatWithFriendSteps
import com.atiurin.sampleapp.steps.CustomClicksSteps
import com.atiurin.sampleapp.steps.MainPageSteps
import com.atiurin.sampleapp.activity.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChattingTests {

    @get:Rule
    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun textFriendTest() {
        with(Data) {
            MainPageSteps.checkDashboard()
                .openChatByName(friendName)
            ChatWithFriendSteps.checkChatIsOpen(friendName)
                .textFriend(textFriend)
                .assertSentTextInChat(textFriend)
        }
    }

    @Test
    fun burgerMenuTest() {
        MainPageSteps.checkDashboard()
            .openBurgerMenu()
        BurgerMenuSteps.chooseBurgerMenuOption(Data.customClicks)
        CustomClicksSteps.checkCustomClicksIsOpen()
            .clickCornerRadioButtons()
            .checkIfRadioButtonsChecked()
    }
}
