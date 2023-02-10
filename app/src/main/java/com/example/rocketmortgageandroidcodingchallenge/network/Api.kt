package com.example.rocketmortgageandroidcodingchallenge.network

import com.example.rocketmortgageandroidcodingchallenge.data.GameResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("/games/")
    fun filterGame(
        @Query("api_key") apiKey: String,
        @Query("filter") filter: String,
        @Query("format") format: String
    ): GameResponse
}