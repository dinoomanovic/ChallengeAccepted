package com.odin.challengeaccepted.utils

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class DataBoundViewHolder<T : ViewDataBinding>(val binding: T) : RecyclerView.ViewHolder(binding.root) {
    companion object {

        /**
         * Creates a new ViewHolder for the given layout file.
         *
         *
         * The provided layout must be using data binding.
         *
         * @param parent The RecyclerView
         * @param layoutId The layout id that should be inflated. Must use data binding
         * @param <T> The type of the Binding class that will be generated for the `layoutId`.
         * @return A new ViewHolder that has a reference to the binding class
        </T> */
        fun <T : ViewDataBinding> create(parent: ViewGroup,
                                         @LayoutRes layoutId: Int): DataBoundViewHolder<T> {
            val binding = DataBindingUtil.inflate<T>(LayoutInflater.from(parent.context),
                    layoutId, parent, false)
            return DataBoundViewHolder(binding)
        }
    }
}