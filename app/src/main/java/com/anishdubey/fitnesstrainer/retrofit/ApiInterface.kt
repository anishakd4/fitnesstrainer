package com.anishdubey.fitnesstrainer.retrofit

import com.anishdubey.fitnesstrainer.modelClasses.ResponseData
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("all.json")
    fun getPrograms(): Call<ResponseData>

    @GET("all.json")
    fun getAllData(): Call<ResponseData>
}
