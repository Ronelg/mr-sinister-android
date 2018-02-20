package com.tikal.sinister

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by motibartov on 20/02/2018.
 */

@Module
class AppModule(val application: SinistersApplication) {

    @Provides
    @Singleton
    fun provideAppContext() : Context {
        return this.application
    }
}