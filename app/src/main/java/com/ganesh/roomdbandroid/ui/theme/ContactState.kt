package com.ganesh.roomdbandroid.ui.theme

import com.ganesh.roomdbandroid.Contact
import com.ganesh.roomdbandroid.SortType

data class ContactState(
    val contacts: List<Contact> = emptyList(),
    val firstName: String = "",
    val lastName: String = "",
    val phoneNumber: String = "",
    val isAddingContact: Boolean = false,
    val sortType: SortType = SortType.FIRST_NAME

)
