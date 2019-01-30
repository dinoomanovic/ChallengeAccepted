package com.odin.challengeaccepted.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0014J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\u0016\u0010\u001b\u001a\u00020\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/odin/challengeaccepted/fragment/DetailViewModel;", "Lcom/odin/challengeaccepted/api/base/BaseViewModel;", "userDao", "Lcom/odin/challengeaccepted/database/dao/UserDao;", "albumDao", "Lcom/odin/challengeaccepted/database/dao/AlbumDao;", "photoDao", "Lcom/odin/challengeaccepted/database/dao/PhotoDao;", "(Lcom/odin/challengeaccepted/database/dao/UserDao;Lcom/odin/challengeaccepted/database/dao/AlbumDao;Lcom/odin/challengeaccepted/database/dao/PhotoDao;)V", "detailViewModelObservable", "Lcom/odin/challengeaccepted/fragment/DetailViewModelObservable;", "getDetailViewModelObservable", "()Lcom/odin/challengeaccepted/fragment/DetailViewModelObservable;", "postApi", "Lcom/odin/challengeaccepted/api/GetDataClient;", "getPostApi", "()Lcom/odin/challengeaccepted/api/GetDataClient;", "setPostApi", "(Lcom/odin/challengeaccepted/api/GetDataClient;)V", "subscription", "Lio/reactivex/disposables/Disposable;", "loadPosts", "", "onCleared", "onRetrievePostListError", "onRetrievePostListFinish", "onRetrievePostListStart", "onRetrievePostListSuccess", "postList", "", "Lcom/odin/challengeaccepted/api/dto/AlbumResponse;", "app_debug"})
public final class DetailViewModel extends com.odin.challengeaccepted.api.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.odin.challengeaccepted.fragment.DetailViewModelObservable detailViewModelObservable = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.odin.challengeaccepted.api.GetDataClient postApi;
    private io.reactivex.disposables.Disposable subscription;
    private final com.odin.challengeaccepted.database.dao.UserDao userDao = null;
    private final com.odin.challengeaccepted.database.dao.AlbumDao albumDao = null;
    private final com.odin.challengeaccepted.database.dao.PhotoDao photoDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.odin.challengeaccepted.fragment.DetailViewModelObservable getDetailViewModelObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.odin.challengeaccepted.api.GetDataClient getPostApi() {
        return null;
    }
    
    public final void setPostApi(@org.jetbrains.annotations.NotNull()
    com.odin.challengeaccepted.api.GetDataClient p0) {
    }
    
    public final void loadPosts() {
    }
    
    private final void onRetrievePostListStart() {
    }
    
    private final void onRetrievePostListFinish() {
    }
    
    private final void onRetrievePostListSuccess(java.util.List<com.odin.challengeaccepted.api.dto.AlbumResponse> postList) {
    }
    
    private final void onRetrievePostListError() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public DetailViewModel(@org.jetbrains.annotations.NotNull()
    com.odin.challengeaccepted.database.dao.UserDao userDao, @org.jetbrains.annotations.NotNull()
    com.odin.challengeaccepted.database.dao.AlbumDao albumDao, @org.jetbrains.annotations.NotNull()
    com.odin.challengeaccepted.database.dao.PhotoDao photoDao) {
        super();
    }
}