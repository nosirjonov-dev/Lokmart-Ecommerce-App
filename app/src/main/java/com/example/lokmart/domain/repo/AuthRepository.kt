package com.example.lokmart.domain.repo

import com.example.lokmart.domain.model.User

interface AuthRepository {
    suspend fun signIn(userName: String, password:String) : User
}