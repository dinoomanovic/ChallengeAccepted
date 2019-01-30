package com.odin.challengeaccepted.api.dto

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class UserResponse(
        @field:PrimaryKey
        var id: Int = 0,
        var name: String = "",
        var username: String = "",
        var email: String = ""
)