package com.example.lokmart.data.api.auth.dto

import com.google.gson.annotations.SerializedName

data class SignInRequest(
    @SerializedName("userName")
    val userName:String,
    @SerializedName("password")
    val password:String
)
