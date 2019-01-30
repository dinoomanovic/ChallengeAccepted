package com.odin.challengeaccepted.api.utils.injection.component

import com.odin.challengeaccepted.api.utils.injection.module.NetworkModule
import com.odin.challengeaccepted.fragment.DetailViewModel
import com.odin.challengeaccepted.fragment.PostViewModel
import dagger.Component

import javax.inject.Singleton

/**
 * Component providing inject() methods for presenters.
 */
@Singleton
@Component(modules = [(NetworkModule::class)])
interface ViewModelInjector {
    /**
     * Injects required dependencies into the specified PostViewModel.
     * @param postViewModel PostViewModel in which to inject the dependencies
     */
    fun inject(postViewModel: PostViewModel)
    fun inject(detailViewModel: DetailViewModel)

    @Component.Builder
    interface Builder {
        fun build(): ViewModelInjector

        fun networkModule(networkModule: NetworkModule): Builder
    }
}