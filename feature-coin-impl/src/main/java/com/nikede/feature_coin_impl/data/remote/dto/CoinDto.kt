package com.nikede.feature_coin_impl.data.remote.dto

import com.google.gson.annotations.SerializedName
import com.nikede.feature_coin_impl.domain.model.Coin

internal data class CoinDto(
    val id: String,
    @SerializedName("is_active")
    val isActive: Boolean,
    @SerializedName("is_new")
    val isNew: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)

internal fun CoinDto.toCoin() = Coin(
    id = id,
    isActive = isActive,
    name = name,
    rank = rank,
    symbol = symbol
)