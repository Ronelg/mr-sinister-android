package com.tikal.sinister.api

import com.tikal.sinister.data.Category
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by motibartov on 20/02/2018.
 */
interface ApiService {

    @GET("group")
    fun getGroupWeather(@Query("id") cities: String, @Query("units") units: String = "metric" ) : Flowable<ApiResponse>


    @GET("forecast/daily")
    fun getForecast(@Query("id") location: String, @Query("cnt") period: Int, @Query("units") units: String = "metric" ) : Flowable<ApiResponse>
}