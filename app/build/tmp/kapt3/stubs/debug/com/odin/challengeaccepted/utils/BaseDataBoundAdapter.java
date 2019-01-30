package com.odin.challengeaccepted.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u001e*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0003:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0005J,\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H$J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\'J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0016\u0010\u0014\u001a\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\tH\u0016J\u001e\u0010\u0018\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0016J,\u0010\u0018\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000eH\u0017J\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\tH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/odin/challengeaccepted/utils/BaseDataBoundAdapter;", "T", "Landroid/databinding/ViewDataBinding;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/odin/challengeaccepted/utils/DataBoundViewHolder;", "()V", "mOnRebindCallback", "Landroid/databinding/OnRebindCallback;", "mRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "bindItem", "", "holder", "position", "", "payloads", "", "", "getItemLayoutId", "getItemViewType", "hasNonDataBindingInvalidate", "", "onAttachedToRecyclerView", "recyclerView", "onBindViewHolder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onDetachedFromRecyclerView", "Companion", "app_debug"})
public abstract class BaseDataBoundAdapter<T extends android.databinding.ViewDataBinding> extends android.support.v7.widget.RecyclerView.Adapter<com.odin.challengeaccepted.utils.DataBoundViewHolder<T>> {
    private android.support.v7.widget.RecyclerView mRecyclerView;
    
    /**
     * * This is used to block items from updating themselves. RecyclerView wants to know when an
     *     * item is invalidated and it prefers to refresh it via onRebind. It also helps with performance
     *     * since data binding will not update views that are not changed.
     */
    private final android.databinding.OnRebindCallback<T> mOnRebindCallback = null;
    private static final java.lang.Object DB_PAYLOAD = null;
    public static final com.odin.challengeaccepted.utils.BaseDataBoundAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @android.support.annotation.CallSuper()
    @java.lang.Override()
    public com.odin.challengeaccepted.utils.DataBoundViewHolder<T> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.odin.challengeaccepted.utils.DataBoundViewHolder<T> holder, int position, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> payloads) {
    }
    
    /**
     * * Override this method to handle binding your items into views
     *     *
     *     * @param holder   The ViewHolder that has the binding instance
     *     * @param position The position of the item in the adapter
     *     * @param payloads The payloads that were passed into the onBind method
     */
    protected abstract void bindItem(@org.jetbrains.annotations.NotNull()
    com.odin.challengeaccepted.utils.DataBoundViewHolder<T> holder, int position, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> payloads);
    
    private final boolean hasNonDataBindingInvalidate(java.util.List<? extends java.lang.Object> payloads) {
        return false;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.odin.challengeaccepted.utils.DataBoundViewHolder<T> holder, int position) {
    }
    
    @java.lang.Override()
    public void onAttachedToRecyclerView(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView recyclerView) {
    }
    
    @java.lang.Override()
    public void onDetachedFromRecyclerView(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView recyclerView) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @android.support.annotation.LayoutRes()
    public abstract int getItemLayoutId(int position);
    
    public BaseDataBoundAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0004"}, d2 = {"Lcom/odin/challengeaccepted/utils/BaseDataBoundAdapter$Companion;", "", "()V", "DB_PAYLOAD", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}