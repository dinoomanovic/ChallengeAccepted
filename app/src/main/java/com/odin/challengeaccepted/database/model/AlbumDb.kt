package com.odin.challengeaccepted.database.model

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.odin.challengeaccepted.api.dto.AlbumResponse
import com.odin.challengeaccepted.database.dao.AlbumDao

@Database(entities = [AlbumResponse::class], version = 1)
abstract class AlbumDb : RoomDatabase() {
    abstract fun albumDao(): AlbumDao
}