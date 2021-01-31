package com.github.grieey.coreschedule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.grieey.core_schedule.scheduleOnIO

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    scheduleOnIO(1000) {
      // do something
    }
  }
}