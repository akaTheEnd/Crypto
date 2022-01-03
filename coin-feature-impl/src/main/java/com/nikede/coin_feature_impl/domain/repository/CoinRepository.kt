package com.nikede.coin_feature_impl.domain.repository

import com.nikede.coin_feature_impl.data.remote.dto.CoinDetailDto
import com.nikede.coin_feature_impl.data.remote.dto.CoinDto

/**
 * Repository of network calls
 */
interface CoinRepository {

    /**
     * Get list of coins from API
     *
     * P.S. There`s no way to paginate results from this API
     */
    suspend fun getCoins(): List<CoinDto>

    /**
     * Get coin by ID
     *
     * @param coinId id of the coin
     */
    suspend fun getCoinById(coinId: String): CoinDetailDto
}