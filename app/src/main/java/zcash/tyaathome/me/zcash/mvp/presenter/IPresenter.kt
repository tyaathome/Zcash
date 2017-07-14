package zcash.tyaathome.me.zcash.mvp.presenter

import android.view.View

/**
 * Created by tyaathome on 2017/7/2.
 */
interface IPresenter<T: View> {
    fun attachView(t: T)
    fun detachView()
}