package zcash.tyaathome.me.zcash.di.component

import dagger.Component
import zcash.tyaathome.me.zcash.di.module.MinerModule
import zcash.tyaathome.me.zcash.ui.activity.MainActivity

/**
 * Created by tyaathome on 2017/6/30.
 */
@Component(modules = arrayOf(MinerModule::class))
interface MinerComponent {
    fun inject(activity: MainActivity)
}