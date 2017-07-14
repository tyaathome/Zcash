package zcash.tyaathome.me.zcash.mvp.contract

import io.reactivex.Observable
import zcash.tyaathome.me.zcash.bean.Miner
import zcash.tyaathome.me.zcash.mvp.model.IModel


/**
 * Created by tyaathome on 2017/7/2.
 */
interface MinerContract {
    interface View {
        fun setService(string: String)
    }
    interface Presenter
    interface Model: IModel<Observable<Miner>>
}