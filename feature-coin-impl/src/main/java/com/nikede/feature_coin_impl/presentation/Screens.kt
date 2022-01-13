package com.nikede.feature_coin_impl.presentation

/**
 * Screens of the feature
 */
internal sealed class Screens(val route: String) {
    object CoinListScreen: Screens("coin_list")
    object CoinDetailScreen: Screens("coin_detail")
}