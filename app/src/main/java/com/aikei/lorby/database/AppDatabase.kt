package com.aikei.lorby.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.aikei.lorby.model.User // Assume User is your entity annotated with @Entity

@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}