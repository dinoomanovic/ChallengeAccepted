package com.odin.challengeaccepted.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\b\u0010\u0017\u001a\u00020\u0012H\u0002J\u0016\u0010\u0018\u001a\u00020\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/odin/challengeaccepted/fragment/PostViewModel;", "Lcom/odin/challengeaccepted/api/base/BaseViewModel;", "postDao", "Lcom/odin/challengeaccepted/database/dao/PostDao;", "(Lcom/odin/challengeaccepted/database/dao/PostDao;)V", "postApi", "Lcom/odin/challengeaccepted/api/GetDataClient;", "getPostApi", "()Lcom/odin/challengeaccepted/api/GetDataClient;", "setPostApi", "(Lcom/odin/challengeaccepted/api/GetDataClient;)V", "postViewModelObservable", "Lcom/odin/challengeaccepted/fragment/PostViewModelObservable;", "getPostViewModelObservable", "()Lcom/odin/challengeaccepted/fragment/PostViewModelObservable;", "subscription", "Lio/reactivex/disposables/Disposable;", "loadData", "", "loadPosts", "onCleared", "onRetrievePostListError", "onRetrievePostListFinish", "onRetrievePostListStart", "onRetrievePostListSuccess", "postList", "", "Lcom/odin/challengeaccepted/api/dto/PostResponse;", "app_debug"})
public final class PostViewModel extends com.odin.challengeaccepted.api.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.odin.challengeaccepted.fragment.PostViewModelObservable postViewModelObservable = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.odin.challengeaccepted.api.GetDataClient postApi;
    private io.reactivex.disposables.Disposable subscription;
    private final com.odin.challengeaccepted.database.dao.PostDao postDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.odin.challengeaccepted.fragment.PostViewModelObservable getPostViewModelObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.odin.challengeaccepted.api.GetDataClient getPostApi() {
        return null;
    }
    
    public final void setPostApi(@org.jetbrains.annotations.NotNull()
    com.odin.challengeaccepted.api.GetDataClient p0) {
    }
    
    public final void loadData() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    private final void loadPosts() {
    }
    
    private final void onRetrievePostListStart() {
    }
    
    private final void onRetrievePostListFinish() {
    }
    
    private final void onRetrievePostListSuccess(java.util.List<com.odin.challengeaccepted.api.dto.PostResponse> postList) {
    }
    
    private final void onRetrievePostListError() {
    }
    
    public PostViewModel(@org.jetbrains.annotations.NotNull()
    com.odin.challengeaccepted.database.dao.PostDao postDao) {
        super();
    }
}