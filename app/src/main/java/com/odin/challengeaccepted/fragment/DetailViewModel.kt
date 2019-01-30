package com.odin.challengeaccepted.fragment

import com.odin.challengeaccepted.api.GetDataClient
import com.odin.challengeaccepted.api.base.BaseViewModel
import com.odin.challengeaccepted.api.dto.AlbumResponse
import com.odin.challengeaccepted.database.dao.AlbumDao
import com.odin.challengeaccepted.database.dao.PhotoDao
import com.odin.challengeaccepted.database.dao.UserDao
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class DetailViewModel(private val userDao: UserDao,
                      private val albumDao: AlbumDao,
                      private val photoDao: PhotoDao) : BaseViewModel() {

    val detailViewModelObservable: DetailViewModelObservable = DetailViewModelObservable()
    @Inject
    lateinit var postApi: GetDataClient
    private lateinit var subscription: Disposable

    init {
        loadPosts()
    }

    fun loadPosts() {
        subscription = Observable.fromCallable { albumDao.all }
                .concatMap { dbAlbumsList ->
                    if (dbAlbumsList.isEmpty())
                        postApi.getAlbums().concatMap { apiPostList ->
                            albumDao.insertAll(*apiPostList.toTypedArray())
                            Observable.just(apiPostList)
                        }
                    else {
                        Observable.just(dbAlbumsList)
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

    private fun onRetrievePostListSuccess(postList: List<AlbumResponse>) {
        detailViewModelObservable.loadData(postList)
//        postListAdapter.updatePostList(postList)
    }

    private fun onRetrievePostListError() {
//        postViewModelObservable.progressBarVisible = View.GONE
//        postViewModelObservable.notifyProgressBarChanged()
//        errorMessage.value = R.string.post_error
    }

    override fun onCleared() {
        super.onCleared()
        subscription.dispose()
    }

}