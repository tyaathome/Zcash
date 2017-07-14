package zcash.tyaathome.me.zcash.bean

/**
 * Created by tyaathome on 2017/6/29.
 */
class MinerData {
    private constructor() {

    }
    companion object {
        private object Holder {val INSTANCE = MinerData() }
        private val instan: MinerData? by lazy { Holder.INSTANCE }
        fun getInstance(): MinerData {
            return instan!!
        }
    }
}
