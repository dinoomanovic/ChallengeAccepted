package com.odin.challengeaccepted.fragment

import android.databinding.BaseObservable
import android.databinding.Bindable
import com.odin.challengeaccepted.BR

class PostItemViewModel : BaseObservable() {

    @Bindable
    var title : String = ""

    fun setTitleText(text : String) {
        title = text
        notifyPropertyChanged(BR.title)
    }

    @Bindable
    var body : String = ""

    fun setBodyText(text : String) {
        body = text
        notifyPropertyChanged(BR.body)
    }
}