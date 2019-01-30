package com.odin.challengeaccepted.database.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.odin.challengeaccepted.api.dto.PostResponse

@Dao
interface PostDao {
    @get:Query("SELECT * FROM postresponse")
    val all: List<PostResponse>

    @Insert
    fun insertAll(vararg posts: PostResponse)
}