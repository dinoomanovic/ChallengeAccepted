package com.odin.challengeaccepted.fragment

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.odin.challengeaccepted.R
import com.odin.challengeaccepted.api.utils.injection.ViewModelFactory
import com.odin.challengeaccepted.databinding.FragmentDetailBinding
import com.odin.challengeaccepted.utils.DataBoundViewHolder
import com.odin.challengeaccepted.utils.MultiTypeDataBoundAdapter

class DetailFragment : Fragment() {
    lateinit var binding: FragmentDetailBinding
    private lateinit var viewModel: DetailViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_detail, container, false)

        viewModel = ViewModelProviders.of(this, ViewModelFactory(activity!! as AppCompatActivity)).get(DetailViewModel::class.java)
        binding.data = viewModel.detailViewModelObservable
        viewModel.loadPosts()

        return binding.root
    }

    class DetailAdapter(mItems: MutableList<Any>) : MultiTypeDataBoundAdapter(mItems.toMutableList()) {
        private val recyclerItems = ArrayList<Any>()

        override fun bindItem(holder: DataBoundViewHolder<ViewDataBinding>, position: Int, payloads: List<Any>) {
            super.bindItem(holder, position, recyclerItems)
        }

        override fun getItemCount(): Int {
            return super.getItemCount()
        }

        override fun getItemLayoutId(position: Int): Int {
            val item = getItem(position)

            if (item is AlbumItemViewModel) {
                recyclerItems.add(item)
                return R.layout.album_item
            }

            throw IllegalArgumentException("Unknown item type$item")
        }
    }

}