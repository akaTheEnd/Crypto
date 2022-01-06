package com.nikede.feature_coin_impl.presentation.coin_list

import com.nikede.feature_coin_impl.domain.model.Coin

/**
 * State of CoinDetailScreen
 *
 * @param isLoading is some data loading
 * @param coins coins list
 * @param error error of loading
 */
internal data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)