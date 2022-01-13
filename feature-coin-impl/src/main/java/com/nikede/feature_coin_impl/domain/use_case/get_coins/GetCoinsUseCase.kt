package com.nikede.feature_coin_impl.domain.use_case.get_coins

import com.nikede.feature_coin_impl.domain.model.Coin
import com.nikede.feature_coin_impl.domain.repository.CoinRepository
import com.nikede.core.Resource
import com.nikede.feature_coin_impl.data.remote.dto.toCoin
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

/**
 * UseCase for getting a list of coins
 */
internal class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading<List<Coin>>())
            val coins = repository.getCoins().map { it.toCoin() }
            emit(Resource.Success<List<Coin>>(coins))
        } catch (e: HttpException) {
            emit(Resource.Error<List<Coin>>(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error<List<Coin>>("Couldn't reach server.\nCheck your internet connection"))
        }
    }
}