package com.github.grieey.core_schedule

import android.os.Handler
import android.os.Looper
import io.reactivex.rxjava3.core.Single
import kotlinx.coroutines.GlobalScope
import java.util.*
import kotlin.concurrent.schedule

/**
 * description: 线程控制的顶层方法
 * @date: 2021/1/31 14:14
 * @author: Grieey
 */
/**
 * 延迟delay的时间执行block
 */
inline fun scheduleOnIO(delay: Long, crossinline block: () -> Unit) {
  Timer().schedule(delay) {
    block()
  }
}

/**
 * 延迟delay的时间在主线程执行block
 */
inline fun scheduleOnMain(delay: Long, crossinline block: () -> Unit) {
  Handler(Looper.getMainLooper()).postDelayed({ block() }, delay)
}