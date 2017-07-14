package zcash.tyaathome.me.zcash.mvp.presenter

import android.widget.TextView
import android.widget.Toast
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import zcash.tyaathome.me.zcash.mvp.contract.MinerContract
import zcash.tyaathome.me.zcash.mvp.model.MinerModel
import zcash.tyaathome.me.zcash.presenter.BasePresenter
import zcash.tyaathome.me.zcash.ui.activity.MainActivity
import javax.inject.Inject

/**
 * Created by tyaathome on 2017/6/30.
 */
class MinerPresenter
@Inject constructor(private val activity: MainActivity)
    : BasePresenter<TextView>(), MinerContract.Presenter{

    fun getData() {
        addCompositeDisposable(MinerModel().getData()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe({
                    activity.setService(it.current_server)
                }, {
                    Toast.makeText(activity, it.message, Toast.LENGTH_SHORT).show()
                }))
    }
}
