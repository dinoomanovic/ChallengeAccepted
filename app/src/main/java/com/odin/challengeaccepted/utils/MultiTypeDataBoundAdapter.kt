package com.odin.challengeaccepted.utils

import android.databinding.ViewDataBinding
import com.odin.challengeaccepted.BR

abstract class MultiTypeDataBoundAdapter (private var mItems: MutableList<Any>) : BaseDataBoundAdapter<ViewDataBinding>(){

    override fun bindItem(holder: DataBoundViewHolder<ViewDataBinding>, position: Int, payloads: List<Any>) {
        holder.binding.setVariable(BR.data, mItems[position])
    }

    override fun getItemCount(): Int {
        return mItems.size
    }

    fun getItem(position: Int): Any {
        return mItems[position]
    }

    fun addItem(item: Any) {
        mItems.add(item)
        notifyItemInserted(mItems.size - 1)
    }

    fun addItem(position: Int, item: Any) {
        mItems.add(position, item)
        notifyItemInserted(position)
    }
}