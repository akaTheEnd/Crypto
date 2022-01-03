package com.nikede.coin_feature_impl.presentation.coin_list

import com.nikede.coin_feature_impl.domain.model.Coin

/**
 * State of CoinDetailScreen
 *
 * @param isLoading is some data loading
 * @param coins coins list
 * @param error error of loading
 */
data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)