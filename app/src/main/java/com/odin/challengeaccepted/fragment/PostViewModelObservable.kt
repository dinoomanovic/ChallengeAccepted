package com.odin.challengeaccepted.fragment

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.view.View.GONE
import com.odin.challengeaccepted.BR
import com.odin.challengeaccepted.api.dto.PostResponse
import com.odin.challengeaccepted.database.dao.PostDao

class PostViewModelObservable(private val postDao: PostDao) : BaseObservable() {
    private var items = ArrayList<PostItemViewModel>()

    @Bindable
    val adapter: PostFragment.PostAdapter = PostFragment.PostAdapter(items.toMutableList())
    @Bindable
    var progressBarVisible: Int = GONE

    fun loadData(postList: List<PostResponse>) {
        if (!items.isEmpty()) {
            items.clear()
        }
        progressBarVisible = GONE
        notifyProgressBarChanged()
        postList.forEach {
            val postItemViewModel = PostItemViewModel()
            postItemViewModel.setTitleText(it.title)
            postItemViewModel.setBodyText(it.body)
            items.add(postItemViewModel)
            adapter.addItem(postItemViewModel)
            adapter.notifyDataSetChanged()
        }
    }

    fun notifyProgressBarChanged() {
        notifyPropertyChanged(BR.progressBarVisible)
    }


}