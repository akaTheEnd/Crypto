package com.nikede.feature_coin_api.data.remote.dto

import com.google.gson.annotations.SerializedName

internal data class Tag(
    @SerializedName("coin_counter")
    val coinCounter: Int,
    @SerializedName("ico_counter")
    val icoCounter: Int,
    val id: String,
    val name: String
)