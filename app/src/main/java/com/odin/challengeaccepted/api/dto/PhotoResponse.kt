package com.odin.challengeaccepted.api.dto

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class PhotoResponse(
        var albumId: Int = 0,
        @field:PrimaryKey
        var id: Int = 0,
        var title: String = "",
        var url: String = "",
        var thumbnailUrl: String = ""
)