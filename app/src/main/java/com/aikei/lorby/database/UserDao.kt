package com.aikei.lorby.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.aikei.lorby.model.User

@Dao
interface UserDao {
    @Insert
    suspend fun insertUser(user: User)

    @Query("SELECT * FROM user WHERE id = :userId")
    suspend fun getUserById(userId: Int): User
}