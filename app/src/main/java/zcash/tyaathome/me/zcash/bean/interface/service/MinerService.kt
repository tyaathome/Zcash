package zcash.tyaathome.me.zcash.mvp.model.`interface`.service

import com.google.gson.GsonBuilder
import io.reactivex.Observable
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import zcash.tyaathome.me.zcash.bean.Miner

/**
 * Created by tyaathome on 2017/6/28.
 */
interface MinerService {

    @retrofit2.http.GET("getstat")
    fun getStat(): Observable<Miner>

    companion object Factory {
        private val MINER_URL = "http://0d803d0b.ngrok.io/"
        val gson = GsonBuilder()
                .setLenient()
                .create()
        fun create() = retrofit2.Retrofit.Builder()
                .baseUrl(MinerService.Factory.MINER_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(MinerService.Factory.gson))
                .build()
                .create(MinerService::class.java)
    }

}