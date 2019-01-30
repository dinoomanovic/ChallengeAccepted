package com.odin.challengeaccepted.database.model

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.odin.challengeaccepted.api.dto.PostResponse
import com.odin.challengeaccepted.database.dao.PostDao

@Database(entities = [PostResponse::class], version = 1)
abstract class PostDb : RoomDatabase() {
    abstract fun postDao(): PostDao
}