package com.odin.challengeaccepted.databinding;
import com.odin.challengeaccepted.R;
import com.odin.challengeaccepted.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentPostBindingImpl extends FragmentPostBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.ProgressBar mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPostBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentPostBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.support.v7.widget.RecyclerView) bindings[1]
            );
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.ProgressBar) bindings[2];
        this.mboundView2.setTag(null);
        this.postList.setTag(null);
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
            setData((com.odin.challengeaccepted.fragment.PostViewModelObservable) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable com.odin.challengeaccepted.fragment.PostViewModelObservable Data) {
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
                return onChangeData((com.odin.challengeaccepted.fragment.PostViewModelObservable) object, fieldId);
        }
        return false;
    }
    private boolean onChangeData(com.odin.challengeaccepted.fragment.PostViewModelObservable Data, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.adapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.progressBarVisible) {
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
        com.odin.challengeaccepted.fragment.PostFragment.PostAdapter dataAdapter = null;
        com.odin.challengeaccepted.fragment.PostViewModelObservable data = mData;
        int dataProgressBarVisible = 0;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xbL) != 0) {

                    if (data != null) {
                        // read data.adapter
                        dataAdapter = data.getAdapter();
                    }
            }
            if ((dirtyFlags & 0xdL) != 0) {

                    if (data != null) {
                        // read data.progressBarVisible
                        dataProgressBarVisible = data.getProgressBarVisible();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.mboundView2.setVisibility(dataProgressBarVisible);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            com.odin.challengeaccepted.utils.BindingConversions.adapter(this.postList, dataAdapter);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            com.odin.challengeaccepted.utils.BindingConversions.setLayoutManager(this.postList, com.odin.challengeaccepted.utils.BindingConversions.LayoutManagers.LINEAR_LAYOUT_MANAGER);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data
        flag 1 (0x2L): data.adapter
        flag 2 (0x3L): data.progressBarVisible
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}