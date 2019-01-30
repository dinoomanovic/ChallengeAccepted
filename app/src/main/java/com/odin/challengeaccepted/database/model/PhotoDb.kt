package com.odin.challengeaccepted.database.model

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.odin.challengeaccepted.api.dto.PhotoResponse
import com.odin.challengeaccepted.database.dao.PhotoDao

@Database(entities = [PhotoResponse::class], version = 1)
abstract class PhotoDb : RoomDatabase() {
    abstract fun photoDao(): PhotoDao
}