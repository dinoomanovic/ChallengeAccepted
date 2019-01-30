package com.odin.challengeaccepted.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.odin.challengeaccepted.fragment.PostViewModelObservable;

public abstract class FragmentPostBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView postList;

  @Bindable
  protected PostViewModelObservable mData;

  protected FragmentPostBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, RecyclerView postList) {
    super(_bindingComponent, _root, _localFieldCount);
    this.postList = postList;
  }

  public abstract void setData(@Nullable PostViewModelObservable data);

  @Nullable
  public PostViewModelObservable getData() {
    return mData;
  }

  @NonNull
  public static FragmentPostBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentPostBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentPostBinding>inflate(inflater, com.odin.challengeaccepted.R.layout.fragment_post, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentPostBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentPostBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentPostBinding>inflate(inflater, com.odin.challengeaccepted.R.layout.fragment_post, null, false, component);
  }

  public static FragmentPostBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentPostBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentPostBinding)bind(component, view, com.odin.challengeaccepted.R.layout.fragment_post);
  }
}
