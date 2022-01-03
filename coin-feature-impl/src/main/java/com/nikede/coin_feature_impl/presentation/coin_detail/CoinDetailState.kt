package com.nikede.coin_feature_impl.presentation.coin_detail

import com.nikede.coin_feature_impl.domain.model.CoinDetail

/**
 * State of CoinDetailScreen
 *
 * @param isLoading is some data loading
 * @param coin CoinDetail to show
 * @param error error of loading
 */
data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
