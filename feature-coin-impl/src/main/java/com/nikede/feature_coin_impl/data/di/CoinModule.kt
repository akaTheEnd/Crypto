package com.nikede.feature_coin_api.data.di

import com.nikede.feature_coin_api.data.common.Constants
import com.nikede.feature_coin_api.data.remote.CoinPaprikaApi
import com.nikede.feature_coin_api.data.repository.CoinRepositoryImpl
import com.nikede.feature_coin_api.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Hilt module of the feature
 */
@Module
@InstallIn(SingletonComponent::class)
internal object CoinModule {
    @Provides
    @Singleton
    fun providePaprikaApi(): CoinPaprikaApi = Retrofit.Builder()
        .baseUrl(Constants.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(CoinPaprikaApi::class.java)

    @Provides
    @Singleton
    fun provideCoinRepository(api: CoinPaprikaApi): CoinRepository = CoinRepositoryImpl(api)
}