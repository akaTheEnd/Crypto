package com.nikede.crypto.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.navigation.compose.rememberNavController
import com.nikede.core_ui.ui.theme.CryptoTheme
import com.nikede.coin_feature_api.CoinFeatureApi
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * Main activity of the app
 */
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @Inject
    lateinit var coinFeature: CoinFeatureApi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CryptoTheme {
                val navController = rememberNavController()
                Surface(color = MaterialTheme.colors.background) {
                    coinFeature.getCoinFeatureComposes()
                        .CryptoNavHost(navHostController = navController)
                }
            }
        }
    }
}