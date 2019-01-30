package com.odin.challengeaccepted.api.base

import android.arch.lifecycle.ViewModel
import com.odin.challengeaccepted.api.utils.injection.component.DaggerViewModelInjector
import com.odin.challengeaccepted.api.utils.injection.component.ViewModelInjector
import com.odin.challengeaccepted.api.utils.injection.module.NetworkModule
import com.odin.challengeaccepted.fragment.DetailViewModel
import com.odin.challengeaccepted.fragment.PostViewModel

abstract class BaseViewModel : ViewModel() {
    private val injector: ViewModelInjector = DaggerViewModelInjector
            .builder()
            .networkModule(NetworkModule)
            .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is PostViewModel -> injector.inject(this)
            is DetailViewModel -> injector.inject(this)
        }
    }
}