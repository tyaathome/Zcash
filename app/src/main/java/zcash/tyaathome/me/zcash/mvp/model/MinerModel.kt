package zcash.tyaathome.me.zcash.mvp.model

import zcash.tyaathome.me.zcash.mvp.contract.MinerContract
import zcash.tyaathome.me.zcash.mvp.model.`interface`.service.MinerService

/**
 * Created by tyaathome on 2017/7/2.
 */
class MinerModel: MinerContract.Model {
    override fun getData() = MinerService.create().getStat()
}