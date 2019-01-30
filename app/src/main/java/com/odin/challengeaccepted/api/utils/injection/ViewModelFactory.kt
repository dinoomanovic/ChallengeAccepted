package com.odin.challengeaccepted.api.utils.injection

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.arch.persistence.room.Room
import android.support.v7.app.AppCompatActivity
import com.odin.challengeaccepted.database.model.*
import com.odin.challengeaccepted.fragment.DetailViewModel
import com.odin.challengeaccepted.fragment.PostViewModel

class ViewModelFactory(private val activity: AppCompatActivity) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PostViewModel::class.java)) {
            val db = Room.databaseBuilder(activity.applicationContext, PostDb::class.java, "posts").build()
            @Suppress("UNCHECKED_CAST")
            return PostViewModel(db.postDao()) as T
        } else if (modelClass.isAssignableFrom(DetailViewModel::class.java)) {
            val photoDb = Room.databaseBuilder(activity.applicationContext, PhotoDb::class.java, "photos").build()
            val albumDb = Room.databaseBuilder(activity.applicationContext, AlbumDb::class.java, "albums").build()
            val userDb = Room.databaseBuilder(activity.applicationContext, UserDb::class.java, "users").build()

            @Suppress("UNCHECKED_CAST")
            return DetailViewModel(userDb.userDao(), albumDb.albumDao(), photoDb.photoDao()) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")

    }
}