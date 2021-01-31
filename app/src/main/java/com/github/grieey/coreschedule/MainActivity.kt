package com.github.grieey.coreschedule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.grieey.core_schedule.scheduleOnIO
import com.github.grieey.core_schedule.scheduleOnMain
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    scheduleOnIO(1000) {
      // do something on Io thread
    }
    scheduleOnMain(1000) {
      // do something on Main thread
    }
    GlobalScope.launch {
      // do
    }
  }
}