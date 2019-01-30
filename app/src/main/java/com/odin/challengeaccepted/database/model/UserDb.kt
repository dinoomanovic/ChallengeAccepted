package com.odin.challengeaccepted.database.model

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.odin.challengeaccepted.api.dto.UserResponse
import com.odin.challengeaccepted.database.dao.UserDao

@Database(entities = [UserResponse::class], version = 1)
abstract class UserDb : RoomDatabase() {
    abstract fun userDao(): UserDao
}