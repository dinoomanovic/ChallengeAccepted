package com.odin.challengeaccepted.databinding;
import com.odin.challengeaccepted.R;
import com.odin.challengeaccepted.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentDetailBindingImpl extends FragmentDetailBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.arrow_down, 3);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    @NonNull
    private final android.support.v7.widget.RecyclerView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDetailBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentDetailBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.support.v7.widget.RecyclerView) bindings[2];
        this.mboundView2.setTag(null);
        this.titleText.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.data == variableId) {
            setData((com.odin.challengeaccepted.fragment.DetailViewModelObservable) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable com.odin.challengeaccepted.fragment.DetailViewModelObservable Data) {
        updateRegistration(0, Data);
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeData((com.odin.challengeaccepted.fragment.DetailViewModelObservable) object, fieldId);
        }
        return false;
    }
    private boolean onChangeData(com.odin.challengeaccepted.fragment.DetailViewModelObservable Data, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.txtTitle) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.adapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String dataTxtTitle = null;
        com.odin.challengeaccepted.fragment.DetailFragment.DetailAdapter dataAdapter = null;
        com.odin.challengeaccepted.fragment.DetailViewModelObservable data = mData;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xbL) != 0) {

                    if (data != null) {
                        // read data.txtTitle
                        dataTxtTitle = data.getTxtTitle();
                    }
            }
            if ((dirtyFlags & 0xdL) != 0) {

                    if (data != null) {
                        // read data.adapter
                        dataAdapter = data.getAdapter();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.odin.challengeaccepted.utils.BindingConversions.adapter(this.mboundView2, dataAdapter);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            com.odin.challengeaccepted.utils.BindingConversions.setLayoutManager(this.mboundView2, com.odin.challengeaccepted.utils.BindingConversions.LayoutManagers.GRID_LAYOUT_MANAGER);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.titleText, dataTxtTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data
        flag 1 (0x2L): data.txtTitle
        flag 2 (0x3L): data.adapter
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}