package com.odin.challengeaccepted.api

import com.odin.challengeaccepted.api.dto.AlbumResponse
import com.odin.challengeaccepted.api.dto.PhotoResponse
import com.odin.challengeaccepted.api.dto.PostResponse
import com.odin.challengeaccepted.api.dto.UserResponse
import io.reactivex.Observable
import retrofit2.http.GET

interface GetDataClient {
    @GET("/albums")
    fun getAlbums(): Observable<List<AlbumResponse>>

    @GET("/photos")
    fun getPhotos(): Observable<List<PhotoResponse>>

    @GET("/users")
    fun getUsers(): Observable<List<UserResponse>>

    @GET("/posts")
    fun getPosts(): Observable<List<PostResponse>>

}