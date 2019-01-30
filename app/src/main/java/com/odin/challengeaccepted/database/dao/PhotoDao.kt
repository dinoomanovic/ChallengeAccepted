package com.odin.challengeaccepted.database.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.odin.challengeaccepted.api.dto.PhotoResponse
import io.reactivex.Single

@Dao
interface PhotoDao {
    @Query("SELECT * FROM photoresponse")
    fun getPhotos(): Single<List<PhotoResponse>>

    @Insert
    fun insertAll(vararg photos: PhotoResponse)
}