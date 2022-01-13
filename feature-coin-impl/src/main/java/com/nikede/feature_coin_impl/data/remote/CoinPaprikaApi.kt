package com.nikede.feature_coin_api.data.remote

import com.nikede.feature_coin_api.data.remote.dto.CoinDetailDto
import com.nikede.feature_coin_api.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Api for network calls
 */
internal interface CoinPaprikaApi {

    /**
     * Get list of coins from API
     *
     * P.S. There`s no way to paginate results from this API
     */
    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    /**
     * Get coin by ID
     *
     * @param coinId id of the coin
     */
    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailDto
}