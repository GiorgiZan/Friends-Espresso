package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.helper.assertIsViewDisplayed
import com.atiurin.sampleapp.helper.tap
import com.atiurin.sampleapp.pages.FriendsListPage
import com.atiurin.sampleapp.pages.UIElementPage

object MainPageSteps {
    fun checkDashboard(): MainPageSteps {
        FriendsListPage.recyclerFriends.assertIsViewDisplayed()
        UIElementPage.mainPageFriendsText.assertIsViewDisplayed()
        return this
    }

    fun openChatByName(name: String): MainPageSteps {
        FriendsListPage.openChat(name)
        return this
    }
    fun openBurgerMenu(): MainPageSteps {
        UIElementPage.mainManuBtn.tap()
        return this
    }
}
