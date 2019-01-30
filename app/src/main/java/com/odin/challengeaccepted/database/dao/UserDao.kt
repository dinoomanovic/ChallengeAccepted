package com.odin.challengeaccepted.database.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.odin.challengeaccepted.api.dto.UserResponse
import io.reactivex.Single

@Dao
interface UserDao {
    @Query("SELECT * FROM userresponse")
    fun getUsers(): Single<List<UserResponse>>

    @Insert
    fun insertAll(vararg users: UserResponse)
}