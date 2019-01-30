package com.odin.challengeaccepted.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.odin.challengeaccepted.fragment.DetailItemViewModel;

public abstract class DetailItemBinding extends ViewDataBinding {
  @Bindable
  protected DetailItemViewModel mData;

  protected DetailItemBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setData(@Nullable DetailItemViewModel data);

  @Nullable
  public DetailItemViewModel getData() {
    return mData;
  }

  @NonNull
  public static DetailItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static DetailItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<DetailItemBinding>inflate(inflater, com.odin.challengeaccepted.R.layout.detail_item, root, attachToRoot, component);
  }

  @NonNull
  public static DetailItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static DetailItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<DetailItemBinding>inflate(inflater, com.odin.challengeaccepted.R.layout.detail_item, null, false, component);
  }

  public static DetailItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static DetailItemBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (DetailItemBinding)bind(component, view, com.odin.challengeaccepted.R.layout.detail_item);
  }
}
