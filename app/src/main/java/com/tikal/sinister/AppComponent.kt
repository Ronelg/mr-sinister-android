package com.tikal.sinister

import com.tikal.sinister.api.ApiModule
import com.tikal.sinister.data.DataModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by motibartov on 20/02/2018.
 */

@Component(modules = arrayOf(AppModule::class, ApiModule::class, DataModule::class))
@Singleton
interface AppComponent {



}