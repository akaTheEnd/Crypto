package com.nikede.coin_feature_impl.data.repository

import com.nikede.coin_feature_impl.data.remote.CoinPaprikaApi
import com.nikede.coin_feature_impl.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins() = api.getCoins()

    override suspend fun getCoinById(coinId: String) = api.getCoinById(coinId)
}