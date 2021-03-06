package com.odin.challengeaccepted.api.utils.injection.component;

import java.lang.System;

/**
 * * Component providing inject() methods for presenters.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/odin/challengeaccepted/api/utils/injection/component/ViewModelInjector;", "", "inject", "", "detailViewModel", "Lcom/odin/challengeaccepted/fragment/DetailViewModel;", "postViewModel", "Lcom/odin/challengeaccepted/fragment/PostViewModel;", "Builder", "app_debug"})
@dagger.Component(modules = {com.odin.challengeaccepted.api.utils.injection.module.NetworkModule.class})
@javax.inject.Singleton()
public abstract interface ViewModelInjector {
    
    /**
     * * Injects required dependencies into the specified PostViewModel.
     *     * @param postViewModel PostViewModel in which to inject the dependencies
     */
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.odin.challengeaccepted.fragment.PostViewModel postViewModel);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.odin.challengeaccepted.fragment.DetailViewModel detailViewModel);
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/odin/challengeaccepted/api/utils/injection/component/ViewModelInjector$Builder;", "", "build", "Lcom/odin/challengeaccepted/api/utils/injection/component/ViewModelInjector;", "networkModule", "Lcom/odin/challengeaccepted/api/utils/injection/module/NetworkModule;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.odin.challengeaccepted.api.utils.injection.component.ViewModelInjector build();
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.odin.challengeaccepted.api.utils.injection.component.ViewModelInjector.Builder networkModule(@org.jetbrains.annotations.NotNull()
        com.odin.challengeaccepted.api.utils.injection.module.NetworkModule networkModule);
    }
}