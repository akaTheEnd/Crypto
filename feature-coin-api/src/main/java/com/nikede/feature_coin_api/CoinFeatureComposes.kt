package com.nikede.feature_coin_api

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

/**
 * Compose items of the feature
 */
interface CoinFeatureComposes {
    /**
     * Main NavHost of the feature
     */
    @Composable
    fun CryptoNavHost(navHostController: NavHostController)
}