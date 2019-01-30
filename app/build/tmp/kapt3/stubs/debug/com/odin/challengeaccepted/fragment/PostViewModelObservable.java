package com.odin.challengeaccepted.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\u0006\u0010\u0017\u001a\u00020\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0018"}, d2 = {"Lcom/odin/challengeaccepted/fragment/PostViewModelObservable;", "Landroid/databinding/BaseObservable;", "postDao", "Lcom/odin/challengeaccepted/database/dao/PostDao;", "(Lcom/odin/challengeaccepted/database/dao/PostDao;)V", "adapter", "Lcom/odin/challengeaccepted/fragment/PostFragment$PostAdapter;", "getAdapter", "()Lcom/odin/challengeaccepted/fragment/PostFragment$PostAdapter;", "items", "Ljava/util/ArrayList;", "Lcom/odin/challengeaccepted/fragment/PostItemViewModel;", "progressBarVisible", "", "getProgressBarVisible", "()I", "setProgressBarVisible", "(I)V", "loadData", "", "postList", "", "Lcom/odin/challengeaccepted/api/dto/PostResponse;", "notifyProgressBarChanged", "app_debug"})
public final class PostViewModelObservable extends android.databinding.BaseObservable {
    private java.util.ArrayList<com.odin.challengeaccepted.fragment.PostItemViewModel> items;
    @org.jetbrains.annotations.NotNull()
    @android.databinding.Bindable()
    private final com.odin.challengeaccepted.fragment.PostFragment.PostAdapter adapter = null;
    @android.databinding.Bindable()
    private int progressBarVisible;
    private final com.odin.challengeaccepted.database.dao.PostDao postDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.odin.challengeaccepted.fragment.PostFragment.PostAdapter getAdapter() {
        return null;
    }
    
    public final int getProgressBarVisible() {
        return 0;
    }
    
    public final void setProgressBarVisible(int p0) {
    }
    
    public final void loadData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.odin.challengeaccepted.api.dto.PostResponse> postList) {
    }
    
    public final void notifyProgressBarChanged() {
    }
    
    public PostViewModelObservable(@org.jetbrains.annotations.NotNull()
    com.odin.challengeaccepted.database.dao.PostDao postDao) {
        super();
    }
}