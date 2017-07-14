package zcash.tyaathome.me.zcash.mvp.model

/**
 * Created by tyaathome on 2017/7/2.
 */
interface IModel<T: Any> {
    fun getData(): T
}