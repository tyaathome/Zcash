package zcash.tyaathome.me.zcash.ui.activity

import kotlinx.android.synthetic.main.activity_main.*
import zcash.tyaathome.me.zcash.R
import zcash.tyaathome.me.zcash.di.component.DaggerMinerComponent
import zcash.tyaathome.me.zcash.di.module.MinerModule
import zcash.tyaathome.me.zcash.mvp.contract.MinerContract
import zcash.tyaathome.me.zcash.mvp.presenter.MinerPresenter
import ztqpad.pcs.com.ztqpad.ui.activity.BaseActivity
import javax.inject.Inject

class MainActivity : BaseActivity(R.layout.activity_main), MinerContract.View {

    @Inject lateinit var minerPresenter: MinerPresenter

    override fun init() {
        DaggerMinerComponent.builder()
                .minerModule(MinerModule(this))
                .build()
                .inject(this)
        minerPresenter.getData()
    }

    override fun setService(string: String) {
        tv.text = string
    }

    override fun onDestroy() {
        minerPresenter.detachView()
        super.onDestroy()
    }
}
