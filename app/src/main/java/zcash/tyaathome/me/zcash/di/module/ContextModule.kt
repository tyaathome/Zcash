package zcash.tyaathome.me.zcash.di.module

import android.content.Context
import dagger.Module
import dagger.Provides

/**
 * Created by tyaathome on 2017/7/2.
 */
@Module
class ContextModule(val context: Context) {
    @Provides
    fun provideContext() = context
}