package com.odin.challengeaccepted

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.odin.challengeaccepted.api.dto.AlbumResponse
import com.odin.challengeaccepted.fragment.DetailFragment

class MainActivity : AppCompatActivity() {
//    var disposable: Disposable? = null
//    val adapter = NetworkModule
//    val client : GetDataClient = adapter.create()
//    val repositoryProvider = GetAlbumsProvider.provideAlbumRepository(client)

    fun setupArticles(articleList: List<AlbumResponse>) {
        print(articleList)
    }

//    fun showArticles() {
//        disposable =
//                repositoryProvider.getAlbums()
//                        .observeOn(AndroidSchedulers.mainThread())
//                        .subscribeOn(Schedulers.io())
//                        .subscribe ({
//                            result -> setupArticles(result)
//
//                        }, { error ->
//
//                            error.printStackTrace()
//
//                        })
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (isFinishing) {
            return
        }

        clearBackStack()

//        val postFragment: Fragment = PostFragment()
        val detailFragment: Fragment = DetailFragment()
        if (savedInstanceState == null) {
            val ft = supportFragmentManager.beginTransaction()

            ft.replace(R.id.fragment_container, detailFragment)
            ft.disallowAddToBackStack()
            ft.commit()
        }

//        showArticles()


//        call.enqueue(object : Callback<List<Album>> {
//            override fun onResponse(call: Call<List<Album>>, response: Response<List<Album>>) {
//                val data : List<Album>? = response.body()
//                println(data)
//            }
//            override fun onFailure(call: Call<List<Album>>, t: Throwable) {
//            }
//        })
    }

    fun clearBackStack() {
        val fm = supportFragmentManager
        val count = fm.backStackEntryCount
        for (i in 0 until count) {
            fm.popBackStack()
        }
    }
}
