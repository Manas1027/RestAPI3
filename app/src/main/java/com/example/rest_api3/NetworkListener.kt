package com.example.rest_api3

import com.example.rest_api3.model.Rezultat

interface NetworkListener {
    fun onSchoolClassesResponse(models: List<Rezultat>?)
    fun onSchoolClassesFailure(message: String?)
}