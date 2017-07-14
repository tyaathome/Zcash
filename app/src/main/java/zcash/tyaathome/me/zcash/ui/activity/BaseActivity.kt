package ztqpad.pcs.com.ztqpad.ui.activity

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import ztqpad.pcs.com.ztqpad.model.ComponentInitMethod

/**
 * Created by tyaathome on 2017/6/13.
 */

abstract class BaseActivity(var layout: Int): FragmentActivity(), ComponentInitMethod {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout)
        init()
    }

}
