package com.odin.challengeaccepted.api.utils.injection.module

import com.odin.challengeaccepted.api.GetDataClient
import com.odin.challengeaccepted.utils.Konstants.Companion.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.Reusable
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
@Suppress("unused")
object NetworkModule {
//    private val builder = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
////    private val retrofit = builder.build()
////
////    @Provides
////    @Reusable
////    @JvmStatic
////    fun create(): GetDataClient {
////
////        val retrofit = Retrofit.Builder()
////                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
////                .addConverterFactory(GsonConverterFactory.create())
////                .baseUrl(BASE_URL)
////                .build()
////        return retrofit.create<GetDataClient>(GetDataClient::class.java)
////
////    }

    @Provides
    @Reusable
    @JvmStatic
    internal fun providePostApi(retrofit: Retrofit): GetDataClient {
        return retrofit.create(GetDataClient::class.java)
    }

    /**
     * Provides the Retrofit object.
     * @return the Retrofit object
     */
    @Provides
    @Reusable
    @JvmStatic
    internal fun provideRetrofitInterface(): Retrofit {
        return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(MoshiConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
                .build()
    }
}