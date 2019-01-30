package com.odin.challengeaccepted.fragment

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.annotation.StringRes
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.odin.challengeaccepted.R
import com.odin.challengeaccepted.api.utils.injection.ViewModelFactory
import com.odin.challengeaccepted.databinding.FragmentPostBinding
import com.odin.challengeaccepted.utils.DataBoundViewHolder
import com.odin.challengeaccepted.utils.MultiTypeDataBoundAdapter

class PostFragment : Fragment() {

    lateinit var binding: FragmentPostBinding
    private lateinit var viewModel: PostViewModel
    private var errorSnackbar: Snackbar? = null

    companion object {
        @JvmStatic
        fun getLogTag(): String = PostFragment::class.java.simpleName
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_post, container, false)

        viewModel = ViewModelProviders.of(this, ViewModelFactory(activity as AppCompatActivity)).get(PostViewModel::class.java)
        binding.data = viewModel.postViewModelObservable
        viewModel.loadData()

        return binding.root
    }

    private fun showError(@StringRes errorMessage: Int) {
        errorSnackbar = Snackbar.make(binding.root, errorMessage, Snackbar.LENGTH_INDEFINITE)
        errorSnackbar?.show()
    }

    private fun hideError() {
        errorSnackbar?.dismiss()
    }

    class PostAdapter(mItems: MutableList<Any>) : MultiTypeDataBoundAdapter(mItems.toMutableList()) {
        private var recyclerItems = ArrayList<Any>()

        override fun bindItem(holder: DataBoundViewHolder<ViewDataBinding>, position: Int, payloads: List<Any>) {
            super.bindItem(holder, position, recyclerItems)

        }

        override fun getItemCount(): Int {
            return super.getItemCount()
        }

        override fun getItemLayoutId(position: Int): Int {
            val item = getItem(position)

            if (item is PostItemViewModel) {
                recyclerItems.add(item)
                return R.layout.post_item
            }

            throw IllegalArgumentException("Unknown item type$item")
        }
    }

}