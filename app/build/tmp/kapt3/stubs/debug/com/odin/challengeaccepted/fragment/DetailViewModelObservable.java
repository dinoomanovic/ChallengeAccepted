package com.odin.challengeaccepted.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0017"}, d2 = {"Lcom/odin/challengeaccepted/fragment/DetailViewModelObservable;", "Landroid/databinding/BaseObservable;", "()V", "adapter", "Lcom/odin/challengeaccepted/fragment/DetailFragment$DetailAdapter;", "getAdapter", "()Lcom/odin/challengeaccepted/fragment/DetailFragment$DetailAdapter;", "items", "Ljava/util/ArrayList;", "Lcom/odin/challengeaccepted/fragment/AlbumItemViewModel;", "txtTitle", "", "getTxtTitle", "()Ljava/lang/String;", "setTxtTitle", "(Ljava/lang/String;)V", "loadData", "", "postList", "", "Lcom/odin/challengeaccepted/api/dto/AlbumResponse;", "setTitleText", "text", "app_debug"})
public final class DetailViewModelObservable extends android.databinding.BaseObservable {
    private java.util.ArrayList<com.odin.challengeaccepted.fragment.AlbumItemViewModel> items;
    @org.jetbrains.annotations.NotNull()
    @android.databinding.Bindable()
    private final com.odin.challengeaccepted.fragment.DetailFragment.DetailAdapter adapter = null;
    @org.jetbrains.annotations.NotNull()
    @android.databinding.Bindable()
    private java.lang.String txtTitle;
    
    @org.jetbrains.annotations.NotNull()
    public final com.odin.challengeaccepted.fragment.DetailFragment.DetailAdapter getAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTxtTitle() {
        return null;
    }
    
    public final void setTxtTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void setTitleText(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void loadData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.odin.challengeaccepted.api.dto.AlbumResponse> postList) {
    }
    
    public DetailViewModelObservable() {
        super();
    }
}