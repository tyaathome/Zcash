package zcash.tyaathome.me.zcash.di.module

import dagger.Module
import dagger.Provides
import zcash.tyaathome.me.zcash.ui.activity.MainActivity

/**
 * Created by tyaathome on 2017/6/30.
 */
@Module
class MinerModule(val activity: MainActivity) {

    @Provides
    fun provideActivity() = activity

}
