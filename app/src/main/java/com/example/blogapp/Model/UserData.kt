package com.example.blogapp.Model

import android.provider.ContactsContract.CommonDataKinds.Email

data class UserData(
    val name: String = "",
    val email: String = "",
    val profileImage: String = ""
){
    constructor():this("", "","")
}
