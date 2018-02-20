package com.tikal.sinister.data

import com.tikal.sinister.api.ApiService
import com.tikal.sinister.data.source.SinistersDataSource
import com.tikal.sinister.data.source.SinistersRepository
import com.tikal.sinister.data.source.local.SinistersLocalDataSource
import com.tikal.sinister.data.source.remote.SinistersRemotelDataSource
import dagger.Module
import dagger.Provides

/**
 * Created by motibartov on 20/02/2018.
 */

@Module
class DataModule {

    @Provides
    fun provideLocalDataSource() : SinistersDataSource{
        return SinistersLocalDataSource()
    }

    @Provides
    fun provideRemoteDataSource(service: ApiService) : SinistersDataSource{
        return SinistersRemotelDataSource(service)
    }
    @Provides
    fun provideRepository( localDataSource: SinistersLocalDataSource,  remotelDataSource: SinistersRemotelDataSource): SinistersRepository{
        return SinistersRepository(localDataSource, remotelDataSource)
    }

}