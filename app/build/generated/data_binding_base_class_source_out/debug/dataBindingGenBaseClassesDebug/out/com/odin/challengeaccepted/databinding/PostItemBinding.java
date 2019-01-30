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
import android.widget.ImageView;
import android.widget.TextView;
import com.odin.challengeaccepted.fragment.PostItemViewModel;

public abstract class PostItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView bodyHolder;

  @NonNull
  public final ImageView postItemSelected;

  @NonNull
  public final TextView titleHolder;

  @Bindable
  protected PostItemViewModel mData;

  protected PostItemBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView bodyHolder, ImageView postItemSelected, TextView titleHolder) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bodyHolder = bodyHolder;
    this.postItemSelected = postItemSelected;
    this.titleHolder = titleHolder;
  }

  public abstract void setData(@Nullable PostItemViewModel data);

  @Nullable
  public PostItemViewModel getData() {
    return mData;
  }

  @NonNull
  public static PostItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static PostItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<PostItemBinding>inflate(inflater, com.odin.challengeaccepted.R.layout.post_item, root, attachToRoot, component);
  }

  @NonNull
  public static PostItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static PostItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<PostItemBinding>inflate(inflater, com.odin.challengeaccepted.R.layout.post_item, null, false, component);
  }

  public static PostItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static PostItemBinding bind(@NonNull View view, @Nullable DataBindingComponent component) {
    return (PostItemBinding)bind(component, view, com.odin.challengeaccepted.R.layout.post_item);
  }
}
