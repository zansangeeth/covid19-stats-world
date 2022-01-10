package com.zasa.covid19stats.api

import com.zasa.covid19stats.common.models.CountriesResponse
import retrofit2.Response


interface ApiHelper {
    suspend fun getCountryList(): Response<List<CountriesResponse>>
    suspend fun getCountryInfo(country: String): Response<CountriesResponse>
}