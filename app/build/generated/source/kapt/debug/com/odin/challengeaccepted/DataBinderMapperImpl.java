package com.odin.challengeaccepted;

import android.databinding.DataBinderMapper;
import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.odin.challengeaccepted.databinding.AlbumItemBindingImpl;
import com.odin.challengeaccepted.databinding.DetailItemBindingImpl;
import com.odin.challengeaccepted.databinding.FragmentDetailBindingImpl;
import com.odin.challengeaccepted.databinding.FragmentPostBindingImpl;
import com.odin.challengeaccepted.databinding.PostItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Generated;

@Generated("Android Data Binding")
public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ALBUMITEM = 1;

  private static final int LAYOUT_DETAILITEM = 2;

  private static final int LAYOUT_FRAGMENTDETAIL = 3;

  private static final int LAYOUT_FRAGMENTPOST = 4;

  private static final int LAYOUT_POSTITEM = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.odin.challengeaccepted.R.layout.album_item, LAYOUT_ALBUMITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.odin.challengeaccepted.R.layout.detail_item, LAYOUT_DETAILITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.odin.challengeaccepted.R.layout.fragment_detail, LAYOUT_FRAGMENTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.odin.challengeaccepted.R.layout.fragment_post, LAYOUT_FRAGMENTPOST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.odin.challengeaccepted.R.layout.post_item, LAYOUT_POSTITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ALBUMITEM: {
          if ("layout/album_item_0".equals(tag)) {
            return new AlbumItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for album_item is invalid. Received: " + tag);
        }
        case  LAYOUT_DETAILITEM: {
          if ("layout/detail_item_0".equals(tag)) {
            return new DetailItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for detail_item is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDETAIL: {
          if ("layout/fragment_detail_0".equals(tag)) {
            return new FragmentDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPOST: {
          if ("layout/fragment_post_0".equals(tag)) {
            return new FragmentPostBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_post is invalid. Received: " + tag);
        }
        case  LAYOUT_POSTITEM: {
          if ("layout/post_item_0".equals(tag)) {
            return new PostItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for post_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new com.android.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(9);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "imageAlbum");
      sKeys.put(2, "adapter");
      sKeys.put(3, "data");
      sKeys.put(4, "progressBarVisible");
      sKeys.put(5, "title");
      sKeys.put(6, "body");
      sKeys.put(7, "txtTitle");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/album_item_0", com.odin.challengeaccepted.R.layout.album_item);
      sKeys.put("layout/detail_item_0", com.odin.challengeaccepted.R.layout.detail_item);
      sKeys.put("layout/fragment_detail_0", com.odin.challengeaccepted.R.layout.fragment_detail);
      sKeys.put("layout/fragment_post_0", com.odin.challengeaccepted.R.layout.fragment_post);
      sKeys.put("layout/post_item_0", com.odin.challengeaccepted.R.layout.post_item);
    }
  }
}
