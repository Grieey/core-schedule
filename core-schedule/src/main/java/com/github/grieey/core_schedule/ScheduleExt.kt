package com.github.grieey.core_schedule

import java.util.*
import kotlin.concurrent.schedule

/**
 * description: 线程控制的顶层方法
 * @date: 2021/1/31 14:14
 * @author: Grieey
 */
inline fun scheduleOnIO(delay: Long, crossinline block: () -> Unit) {
    Timer().schedule(delay) {
        block()
    }
}