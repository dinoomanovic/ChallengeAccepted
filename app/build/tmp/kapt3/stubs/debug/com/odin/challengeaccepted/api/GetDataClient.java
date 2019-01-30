package com.odin.challengeaccepted.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H\'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0003H\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u0003H\'\u00a8\u0006\f"}, d2 = {"Lcom/odin/challengeaccepted/api/GetDataClient;", "", "getAlbums", "Lio/reactivex/Observable;", "", "Lcom/odin/challengeaccepted/api/dto/AlbumResponse;", "getPhotos", "Lcom/odin/challengeaccepted/api/dto/PhotoResponse;", "getPosts", "Lcom/odin/challengeaccepted/api/dto/PostResponse;", "getUsers", "Lcom/odin/challengeaccepted/api/dto/UserResponse;", "app_debug"})
public abstract interface GetDataClient {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/albums")
    public abstract io.reactivex.Observable<java.util.List<com.odin.challengeaccepted.api.dto.AlbumResponse>> getAlbums();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/photos")
    public abstract io.reactivex.Observable<java.util.List<com.odin.challengeaccepted.api.dto.PhotoResponse>> getPhotos();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/users")
    public abstract io.reactivex.Observable<java.util.List<com.odin.challengeaccepted.api.dto.UserResponse>> getUsers();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/posts")
    public abstract io.reactivex.Observable<java.util.List<com.odin.challengeaccepted.api.dto.PostResponse>> getPosts();
}