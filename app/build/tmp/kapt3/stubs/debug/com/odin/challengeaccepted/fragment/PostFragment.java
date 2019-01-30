package com.odin.challengeaccepted.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u000e2\b\b\u0001\u0010\u0018\u001a\u00020\u0019H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/odin/challengeaccepted/fragment/PostFragment;", "Landroid/support/v4/app/Fragment;", "()V", "binding", "Lcom/odin/challengeaccepted/databinding/FragmentPostBinding;", "getBinding", "()Lcom/odin/challengeaccepted/databinding/FragmentPostBinding;", "setBinding", "(Lcom/odin/challengeaccepted/databinding/FragmentPostBinding;)V", "errorSnackbar", "Landroid/support/design/widget/Snackbar;", "viewModel", "Lcom/odin/challengeaccepted/fragment/PostViewModel;", "hideError", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "showError", "errorMessage", "", "Companion", "PostAdapter", "app_debug"})
public final class PostFragment extends android.support.v4.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public com.odin.challengeaccepted.databinding.FragmentPostBinding binding;
    private com.odin.challengeaccepted.fragment.PostViewModel viewModel;
    private android.support.design.widget.Snackbar errorSnackbar;
    public static final com.odin.challengeaccepted.fragment.PostFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.odin.challengeaccepted.databinding.FragmentPostBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.odin.challengeaccepted.databinding.FragmentPostBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void showError(@android.support.annotation.StringRes()
    int errorMessage) {
    }
    
    private final void hideError() {
    }
    
    public PostFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getLogTag() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J,\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/odin/challengeaccepted/fragment/PostFragment$PostAdapter;", "Lcom/odin/challengeaccepted/utils/MultiTypeDataBoundAdapter;", "mItems", "", "", "(Ljava/util/List;)V", "recyclerItems", "Ljava/util/ArrayList;", "bindItem", "", "holder", "Lcom/odin/challengeaccepted/utils/DataBoundViewHolder;", "Landroid/databinding/ViewDataBinding;", "position", "", "payloads", "", "getItemCount", "getItemLayoutId", "app_debug"})
    public static final class PostAdapter extends com.odin.challengeaccepted.utils.MultiTypeDataBoundAdapter {
        private java.util.ArrayList<java.lang.Object> recyclerItems;
        
        @java.lang.Override()
        protected void bindItem(@org.jetbrains.annotations.NotNull()
        com.odin.challengeaccepted.utils.DataBoundViewHolder<android.databinding.ViewDataBinding> holder, int position, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends java.lang.Object> payloads) {
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        public int getItemLayoutId(int position) {
            return 0;
        }
        
        public PostAdapter(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Object> mItems) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lcom/odin/challengeaccepted/fragment/PostFragment$Companion;", "", "()V", "getLogTag", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLogTag() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}