package com.aikei.lorby.database

import com.aikei.lorby.model.User
import javax.inject.Inject

class UserRepository @Inject constructor(private val userDao: UserDao) {
    suspend fun insertUser(user: User) = userDao.insertUser(user)

    suspend fun getUserById(userId: Int) = userDao.getUserById(userId)
}