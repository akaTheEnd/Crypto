package com.nikede.feature_coin_impl.data.repository

import com.nikede.feature_coin_impl.data.remote.CoinPaprikaApi
import com.nikede.feature_coin_impl.domain.repository.CoinRepository
import javax.inject.Inject

internal class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins() = api.getCoins()

    override suspend fun getCoinById(coinId: String) = api.getCoinById(coinId)
}