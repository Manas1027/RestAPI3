package com.example.rest_api.retrofit

import com.example.rest_api3.model.Categories
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("/bikashthapa01/myvideos-android-app/master/data.json")
    fun getClasses(@Query("blogEntryId") id: Int): Call<Categories>
}