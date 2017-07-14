package zcash.tyaathome.me.zcash.presenter

import android.view.View
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import zcash.tyaathome.me.zcash.mvp.presenter.IPresenter

/**
 * Created by tyaathome on 2017/7/2.
 */
open abstract class BasePresenter<T: View>: IPresenter<T> {

    private val compositeDisposable = CompositeDisposable()
    private var view: T? = null

    fun addCompositeDisposable(disposable: Disposable) {
        compositeDisposable.add(disposable)
    }

    fun unCompositeDisposable() {
        compositeDisposable.clear()
    }

    override fun attachView(t: T) {
        view = t
    }

    override fun detachView() {
        view = null
    }

}