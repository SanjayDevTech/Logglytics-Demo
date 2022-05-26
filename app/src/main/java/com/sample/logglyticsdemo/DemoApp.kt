package com.sample.logglyticsdemo

import android.app.Application
import com.sample.library.Config
import com.sample.library.Logger

class DemoApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Logger.mint(Config(
            apiKey = "q14V5PRhyLP7oy4MOQEii7px2SFuT4zJ4e88Ml4NRi8Cx7zmmaxzDX-5cbzS9fZt",
            projectId = "b6951cfe-184b-4cde-9dc1-122e196ea904",
        ))
    }
}