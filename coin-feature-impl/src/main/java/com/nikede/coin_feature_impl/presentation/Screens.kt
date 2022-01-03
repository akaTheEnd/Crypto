package com.nikede.coin_feature_impl.presentation

/**
 * Screens of the feature
 */
sealed class Screens(val route: String) {
    object CoinListScreen: Screens("coin_list")
    object CoinDetailScreen: Screens("coin_detail")
}