package com.nikede.feature_coin_api.domain.use_case.get_coin

import com.nikede.feature_coin_api.domain.model.CoinDetail
import com.nikede.feature_coin_api.domain.repository.CoinRepository
import com.nikede.core.Resource
import com.nikede.feature_coin_api.data.remote.dto.toCoinDetail
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

/**
 * UseCase for getting a single coin
 */
internal class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading<CoinDetail>())
            val coin = repository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success<CoinDetail>(coin))
        } catch (e: HttpException) {
            emit(Resource.Error<CoinDetail>(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error<CoinDetail>("Couldn't reach server.\nCheck your internet connection"))
        }
    }
}