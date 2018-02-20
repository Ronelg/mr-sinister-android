package com.tikal.sinister.data.source

import com.tikal.sinister.data.source.local.SinistersLocalDataSource
import com.tikal.sinister.data.source.remote.SinistersRemotelDataSource

/**
 * Created by ronelg on 20/02/2018.
 */
class SinistersRepository(val localDataSource: SinistersLocalDataSource, val remotelDataSource: SinistersRemotelDataSource) : SinistersDataSource{



}