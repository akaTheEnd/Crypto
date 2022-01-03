package com.nikede.coin_feature_impl.data.di

import com.nikede.coin_feature_impl.data.common.Constants
import com.nikede.coin_feature_impl.data.remote.CoinPaprikaApi
import com.nikede.coin_feature_impl.data.repository.CoinRepositoryImpl
import com.nikede.coin_feature_impl.domain.repository.CoinRepository
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
object CoinModule {
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