package com.odin.challengeaccepted.utils

import android.databinding.BindingAdapter
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import java.security.InvalidParameterException

class BindingConversions {
    companion object {
        @JvmStatic
        @BindingAdapter("adapter")
        fun adapter(view: RecyclerView, adapter: RecyclerView.Adapter<*>) {
            view.adapter = adapter
        }

        @JvmStatic
        @BindingAdapter("layoutManager")
        fun setLayoutManager(view: RecyclerView, layoutManager: LayoutManagers) {
            when (layoutManager) {
                BindingConversions.LayoutManagers.LINEAR_LAYOUT_MANAGER -> view.layoutManager = LinearLayoutManager(view.context)
                BindingConversions.LayoutManagers.LINEAR_LAYOUT_MANAGER_HORIZONTAL -> view.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.HORIZONTAL, false)
                BindingConversions.LayoutManagers.GRID_LAYOUT_MANAGER -> view.layoutManager = GridLayoutManager(view.context, 3)
                else -> throw InvalidParameterException(
                        "layoutManager:$layoutManager binding is not implemented")
            }
        }
    }

    enum class LayoutManagers {
        UNKNOWN,
        LINEAR_LAYOUT_MANAGER,
        LINEAR_LAYOUT_MANAGER_HORIZONTAL,
        GRID_LAYOUT_MANAGER
    }
}