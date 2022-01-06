package com.nikede.crypto.di

import com.nikede.feature_coin_api.CoinFeatureApi
import com.nikede.feature_coin_impl.CoinFeatureImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Main module on the app
 */
@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideCryptoFeatureApi(): CoinFeatureApi = CoinFeatureImpl()
}