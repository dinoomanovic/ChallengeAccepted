package com.odin.challengeaccepted.fragment

import android.view.View.GONE
import android.view.View.VISIBLE
import com.odin.challengeaccepted.api.GetDataClient
import com.odin.challengeaccepted.api.base.BaseViewModel
import com.odin.challengeaccepted.api.dto.PostResponse
import com.odin.challengeaccepted.database.dao.PostDao
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class PostViewModel(private val postDao: PostDao) : BaseViewModel() {
    val postViewModelObservable: PostViewModelObservable = PostViewModelObservable(postDao)
    @Inject
    lateinit var postApi: GetDataClient
    private lateinit var subscription: Disposable

    init {
        loadPosts()
    }

    fun loadData() {
    }

    override fun onCleared() {
        super.onCleared()
        subscription.dispose()
    }

    private fun loadPosts() {
        postViewModelObservable.progressBarVisible = VISIBLE
        postViewModelObservable.notifyProgressBarChanged()
        subscription = Observable.fromCallable { postDao.all }
                .concatMap { dbPostList ->
                    if (dbPostList.isEmpty())
                        postApi.getPosts().concatMap { apiPostList ->
                            postDao.insertAll(*apiPostList.toTypedArray())
                            Observable.just(apiPostList)
                        }
                    else {
                        Observable.just(dbPostList)
                    }
                }
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe { onRetrievePostListStart() }
                .doOnTerminate { onRetrievePostListFinish() }
                .subscribe(
                        { result -> onRetrievePostListSuccess(result) },
                        { onRetrievePostListError() }
                )
    }

    private fun onRetrievePostListStart() {
//        loadingVisibility.value = View.VISIBLE
//        errorMessage.value = null
    }

    private fun onRetrievePostListFinish() {
//        loadingVisibility.value = View.GONE
    }

    private fun onRetrievePostListSuccess(postList: List<PostResponse>) {
        postViewModelObservable.loadData(postList)
//        postListAdapter.updatePostList(postList)
    }

    private fun onRetrievePostListError() {
        postViewModelObservable.progressBarVisible = GONE
        postViewModelObservable.notifyProgressBarChanged()
//        errorMessage.value = R.string.post_error
    }
}