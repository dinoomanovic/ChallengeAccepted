package com.odin.challengeaccepted.api.dto

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class PostResponse(
        var userId: Int = 0,
        @field:PrimaryKey
        var id: Int = 0,
        var title: String = "",
        var body: String = ""
)