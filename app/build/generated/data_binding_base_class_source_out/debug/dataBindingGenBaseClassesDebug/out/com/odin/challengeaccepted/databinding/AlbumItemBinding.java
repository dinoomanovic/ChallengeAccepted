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
import com.odin.challengeaccepted.fragment.AlbumItemViewModel;

public abstract class AlbumItemBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView textView;

  @Bindable
  protected AlbumItemViewModel mData;

  protected AlbumItemBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView imageView, TextView textView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageView = imageView;
    this.textView = textView;
  }

  public abstract void setData(@Nullable AlbumItemViewModel data);

  @Nullable
  public AlbumItemViewModel getData() {
    return mData;
  }

  @NonNull
  public static AlbumItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static AlbumItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<AlbumItemBinding>inflate(inflater, com.odin.challengeaccepted.R.layout.album_item, root, attachToRoot, component);
  }

  @NonNull
  public static AlbumItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static AlbumItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<AlbumItemBinding>inflate(inflater, com.odin.challengeaccepted.R.layout.album_item, null, false, component);
  }

  public static AlbumItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static AlbumItemBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (AlbumItemBinding)bind(component, view, com.odin.challengeaccepted.R.layout.album_item);
  }
}
