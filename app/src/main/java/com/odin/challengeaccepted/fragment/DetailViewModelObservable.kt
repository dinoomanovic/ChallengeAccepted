package com.odin.challengeaccepted.fragment

import android.databinding.BaseObservable
import android.databinding.Bindable
import com.odin.challengeaccepted.BR
import com.odin.challengeaccepted.api.dto.AlbumResponse
import java.util.*

class DetailViewModelObservable : BaseObservable() {
    private var items = ArrayList<AlbumItemViewModel>()

    @Bindable
    val adapter: DetailFragment.DetailAdapter = DetailFragment.DetailAdapter(items.toMutableList())
    @Bindable
    var txtTitle : String = "Test text"

    fun setTitleText(text : String) {
        txtTitle = text
        notifyPropertyChanged(BR.txtTitle)
    }

    fun loadData(postList: List<AlbumResponse>) {
        if (!items.isEmpty()) {
            items.clear()
        }
        postList.forEach {
            val albumItemViewModel = AlbumItemViewModel()
            albumItemViewModel.setTitleText(it.title)
            items.add(albumItemViewModel)
            adapter.addItem(albumItemViewModel)
            adapter.notifyDataSetChanged()
        }
    }

}