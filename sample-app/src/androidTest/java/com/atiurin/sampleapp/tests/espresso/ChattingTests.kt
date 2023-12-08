package com.atiurin.sampleapp.tests.espresso

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.data.Data
import com.atiurin.sampleapp.steps.BurgerMenuSteps
import com.atiurin.sampleapp.steps.ChatWithFriendSteps
import com.atiurin.sampleapp.steps.MainPageSteps
import com.atiurin.sampleapp.steps.UIElementsSteps
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChattingTests {

    @get:Rule
    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)

//    @Test
//    fun textFriendTest() {
//        with(Data) {
//            MainPageSteps.checkDashboard()
//                .openChatByName(friendName)
//            ChatWithFriendSteps.checkChatIsOpen(friendName)
//                .textFriend(textFriend)
//                .assertSentTextInChat(textFriend)
//        }
//    }
//
//    @Test
//    fun burgerMenuTest() {
//        MainPageSteps.checkDashboard()
//            .openBurgerMenu()
//        BurgerMenuSteps.chooseBurgerMenuOption(Data.customClicks)
//        CustomClicksSteps.checkCustomClicksIsOpen()
//            .clickCornerRadioButtons()
//            .checkIfRadioButtonsChecked()
//    }

    @Test
    fun scrollToEmmetTest() {
        with(Data) {
            MainPageSteps.scrollToFriend(friendEmmetBrown)
                .openChatByName(friendEmmetBrown)
            ChatWithFriendSteps.checkChatIsOpen(friendEmmetBrown)
                .textFriend(goForADrinkText)
                .assertSentTextInChat(goForADrinkText)
        }
    }

    @Test
    fun scrollToFriend17Test() {
        with(Data) {
            MainPageSteps.scrollToFriend(nameOfFriend17)
                .openChatByName(nameOfFriend17)
            ChatWithFriendSteps.checkChatIsOpen(nameOfFriend17)
                .textFriend(changeYourNameText)
                .assertSentTextInChat(changeYourNameText)
        }
    }

    @Test
    fun burgerMenuUIElementsTest() {
        MainPageSteps.checkDashboard()
            .openBurgerMenu()
        BurgerMenuSteps.chooseBurgerMenuOption(Data.UIElements)
        UIElementsSteps.checkUIElementsPageIsOpen()
            .clickEnableCheckbox()
            .clickClickableCheckbox()
            .isEnableCheckboxChecked()
            .isClickableCheckboxChecked()
            .clickInvisibleRadioButton()
            .checkButton1IsInvisible()
    }
}
