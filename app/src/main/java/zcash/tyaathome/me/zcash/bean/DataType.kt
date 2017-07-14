package zcash.tyaathome.me.zcash.bean

/**
 * Created by tyaathome on 2017/6/27.
 */
/**
 * 矿机类
 */
data class Miner(val method: String, val error: String, val start_time: Long, val current_server: String,
                 val available_servers: Int, val server_status: Int, val result: List<GPUState>)

/**
 * 显卡状态类
 */
data class GPUState(val gpuid: Int, val cudaid: Int, val busid: String, val name: String, val gpu_status: Int,
                      val solver: Int, val temperature: Int, val gpu_power_usage: Int, val speed_sps: Int,
                      val accepted_shares: Int, val rejected_shares: Int, val start_time: Long)