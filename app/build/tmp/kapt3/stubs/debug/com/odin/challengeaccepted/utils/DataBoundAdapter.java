package com.odin.challengeaccepted.utils;

import java.lang.System;

/**
 * * Creates a DataBoundAdapter with the given item layout
 * *
 * * @param layoutId The layout to be used for items. It must use data binding.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016R\u0010\u0010\u0004\u001a\u00020\u00058\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/odin/challengeaccepted/utils/DataBoundAdapter;", "T", "Landroid/databinding/ViewDataBinding;", "Lcom/odin/challengeaccepted/utils/BaseDataBoundAdapter;", "mLayoutId", "", "(I)V", "getItemLayoutId", "position", "app_debug"})
public abstract class DataBoundAdapter<T extends android.databinding.ViewDataBinding> extends com.odin.challengeaccepted.utils.BaseDataBoundAdapter<T> {
    @android.support.annotation.LayoutRes()
    private final int mLayoutId = 0;
    
    @java.lang.Override()
    public int getItemLayoutId(int position) {
        return 0;
    }
    
    public DataBoundAdapter(@android.support.annotation.LayoutRes()
    int mLayoutId) {
        super();
    }
}