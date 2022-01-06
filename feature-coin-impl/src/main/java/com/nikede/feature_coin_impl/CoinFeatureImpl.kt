package com.nikede.feature_coin_impl

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.nikede.feature_coin_api.CoinFeatureApi
import com.nikede.feature_coin_api.CoinFeatureComposes
import com.nikede.feature_coin_impl.data.common.Constants
import com.nikede.feature_coin_impl.presentation.Screens
import com.nikede.feature_coin_impl.presentation.coin_detail.CoinDetailScreen
import com.nikede.feature_coin_impl.presentation.coin_list.CoinListScreen
import javax.inject.Inject

class CoinFeatureImpl : CoinFeatureApi {
    override fun getCoinFeatureComposes(): CoinFeatureComposes = CoinFeatureComposesImpl()

    internal class CoinFeatureComposesImpl @Inject constructor() : CoinFeatureComposes {
        @Composable
        override fun CryptoNavHost(navHostController: NavHostController) = NavHost(
            navController = navHostController,
            startDestination = Screens.CoinListScreen.route
        ) {
            composable(
                route = Screens.CoinListScreen.route
            ) {
                CoinListScreen(navHostController)
            }
            composable(
                route = Screens.CoinDetailScreen.route + "/{${Constants.PARAM_COIN_ID}}"
            ) {
                CoinDetailScreen()
            }
        }
    }
}