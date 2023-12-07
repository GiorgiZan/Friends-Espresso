package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.pages.ChatPage

object ChatWithFriendSteps {

    fun checkChatIsOpen(chatName: String): ChatWithFriendSteps {
        ChatPage.assertToolbarTitle(chatName)
        return this
    }

    fun textFriend(message: String): ChatWithFriendSteps {
        ChatPage.sendMessage(message)
        return this
    }

    fun assertSentTextInChat(message: String): ChatWithFriendSteps {
        ChatPage.assertMessageDisplayed(message)
        return this
    }
}
