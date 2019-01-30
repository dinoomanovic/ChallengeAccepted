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
import android.widget.Button;
import android.widget.TextView;
import com.odin.challengeaccepted.fragment.DetailViewModelObservable;

public abstract class FragmentDetailBinding extends ViewDataBinding {
  @NonNull
  public final Button arrowDown;

  @NonNull
  public final TextView titleText;

  @Bindable
  protected DetailViewModelObservable mData;

  protected FragmentDetailBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button arrowDown, TextView titleText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.arrowDown = arrowDown;
    this.titleText = titleText;
  }

  public abstract void setData(@Nullable DetailViewModelObservable data);

  @Nullable
  public DetailViewModelObservable getData() {
    return mData;
  }

  @NonNull
  public static FragmentDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentDetailBinding>inflate(inflater, com.odin.challengeaccepted.R.layout.fragment_detail, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentDetailBinding>inflate(inflater, com.odin.challengeaccepted.R.layout.fragment_detail, null, false, component);
  }

  public static FragmentDetailBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentDetailBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentDetailBinding)bind(component, view, com.odin.challengeaccepted.R.layout.fragment_detail);
  }
}
