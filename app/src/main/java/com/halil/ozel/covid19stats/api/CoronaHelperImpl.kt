package com.zasa.covid19stats.api

import com.zasa.covid19stats.common.models.CountriesResponse
import retrofit2.Response
import javax.inject.Inject


class CoronaHelperImpl @Inject constructor(private val service: CoronaService) : ApiHelper {

    override suspend fun getCountryList(): Response<List<CountriesResponse>> =
        service.getCountryList()

    override suspend fun getCountryInfo(country: String): Response<CountriesResponse> =
        service.getCountryInfo(country)
}