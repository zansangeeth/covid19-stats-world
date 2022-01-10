package com.zasa.covid19stats.screens.detail.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.halil.ozel.covid19stats.databinding.ActivityDetailBinding
import com.squareup.picasso.Picasso
import com.zasa.covid19stats.common.utils.Consts.Companion.CASES
import com.zasa.covid19stats.common.utils.Consts.Companion.COUNTRY
import com.zasa.covid19stats.common.utils.Consts.Companion.DEATHS
import com.zasa.covid19stats.common.utils.Consts.Companion.FLAG
import com.zasa.covid19stats.common.utils.Consts.Companion.RECOVERED
import com.zasa.covid19stats.common.utils.Consts.Companion.TESTS
import com.zasa.covid19stats.common.utils.Consts.Companion.TODAY_CASE
import com.zasa.covid19stats.common.utils.Consts.Companion.TODAY_DEATH

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setCountryInfo()
    }

    private fun setCountryInfo() {
        val countryName = intent.getStringExtra(COUNTRY)
        val todayCase = intent.getStringExtra(TODAY_CASE)
        val todayDeath = intent.getStringExtra(TODAY_DEATH)
        val totalCases = intent.getStringExtra(CASES)
        val totalDeaths = intent.getStringExtra(DEATHS)
        val totalTests = intent.getStringExtra(TESTS)
        val totalRecovered = intent.getStringExtra(RECOVERED)

        binding.tvCountryName.text = countryName
        binding.tvTodayCases.text = todayCase
        binding.tvTodayDeath.text = todayDeath
        binding.tvTotalTests.text = totalTests
        binding.tvTotalCases.text = totalCases
        binding.tvTotalDeaths.text = totalDeaths
        binding.tvTotalRecovered.text = totalRecovered
        Picasso.with(applicationContext).load(intent.getStringExtra(FLAG))
            .into(binding.ivCountryPoster)
    }
}