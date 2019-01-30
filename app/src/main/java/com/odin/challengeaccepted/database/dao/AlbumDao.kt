package com.odin.challengeaccepted.database.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.odin.challengeaccepted.api.dto.AlbumResponse

@Dao
interface AlbumDao {
    @get:Query("SELECT * FROM albumresponse")
    val all: List<AlbumResponse>

    @Insert
    fun insertAll(vararg albums: AlbumResponse)
}