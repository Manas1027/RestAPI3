package com.example.rest_api3

import com.example.rest_api3.model.Categories
import com.example.rest_api.retrofit.ApiInterface
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit

class NetworkHelper(private val apiClient: Retrofit) {

    fun getClasses(listener: NetworkListener, id: Int){
        val call : retrofit2.Call<Categories> = apiClient.create(ApiInterface::class.java).getClasses(id)
        call.enqueue(object : retrofit2.Callback<Categories> {

            override fun onFailure(call: retrofit2.Call<Categories>?, t: Throwable?) {
                listener.onSchoolClassesFailure(t?.localizedMessage)
            }

            override fun onResponse(call: Call<Categories>?, response: Response<Categories>?) {
                listener.onSchoolClassesResponse(response?.body()?.categories)
            }

        })
    }

}