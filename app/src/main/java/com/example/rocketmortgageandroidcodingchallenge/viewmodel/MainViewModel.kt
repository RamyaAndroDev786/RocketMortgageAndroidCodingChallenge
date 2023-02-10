package com.example.rocketmortgageandroidcodingchallenge.viewmodel

import androidx.lifecycle.ViewModel
import com.example.rocketmortgageandroidcodingchallenge.network.RetrofitInstance

class MainViewModel : ViewModel() {

    fun callApi(query: String?){
        query?.let { filter ->
            RetrofitInstance.api.filterGame(
                apiKey = "9d45436f87d3848d2bdcce810bacb6df57dfd134",
                filter = filter,
                format = "json"
            )
        }
    }
}