package com.tikal.sinister

import android.app.Application
import timber.log.Timber

/**
 * Created by ronelg on 20/02/2018.
 */
class SinistersApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}