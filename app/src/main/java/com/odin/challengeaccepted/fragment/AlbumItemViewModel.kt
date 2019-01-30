package com.odin.challengeaccepted.fragment

import android.databinding.BaseObservable
import android.databinding.Bindable
import com.odin.challengeaccepted.BR

class AlbumItemViewModel: BaseObservable() {
    @Bindable
    var title : String = ""

    fun setTitleText(text : String) {
        title = text
        notifyPropertyChanged(BR.title)
    }

    @Bindable
    var imageAlbum : Int = 0

    fun setImage(img : Int) {
        imageAlbum = img
        notifyPropertyChanged(BR.body)
    }
}