//package com.aikei.lorby.di
//
//import android.content.Context
//import androidx.room.Room
//import com.aikei.lorby.database.AppDatabase
//import com.aikei.lorby.database.UserDao
//import com.aikei.lorby.database.UserRepository
//import dagger.Module
//import dagger.Provides
//import dagger.hilt.InstallIn
//import dagger.hilt.components.SingletonComponent
//import javax.inject.Singleton
//
//@Module
//@InstallIn(SingletonComponent::class)
//object DatabaseModule {
//
//    @Provides
//    @Singleton
//    fun provideAppDatabase(context: Context): AppDatabase {
//        return Room.databaseBuilder(context, AppDatabase::class.java, "app_database").build()
//    }
//
//    @Provides
//    fun provideUserDao(appDatabase: AppDatabase): UserDao {
//        return appDatabase.userDao()
//    }
//
//    @Provides
//    fun provideUserRepository(userDao: UserDao): UserRepository {
//        return UserRepository(userDao)
//    }
//}
