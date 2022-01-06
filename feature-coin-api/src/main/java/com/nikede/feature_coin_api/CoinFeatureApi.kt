package com.nikede.feature_coin_api

/**
 * API of coin feature
 */
interface CoinFeatureApi {
    /**
     * Return a Compose items of the feature
     */
    fun getCoinFeatureComposes(): CoinFeatureComposes
}