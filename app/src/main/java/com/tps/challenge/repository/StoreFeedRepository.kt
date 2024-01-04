package com.tps.challenge.repository

import com.tps.challenge.Constants.DEFAULT_LATITUDE
import com.tps.challenge.Constants.DEFAULT_LONGITUDE
import com.tps.challenge.network.TPSCoroutineService
import com.tps.challenge.network.model.StoreResponse
import javax.inject.Inject

class StoreFeedRepository @Inject constructor(private val tpsCoroutineService: TPSCoroutineService) {

    suspend fun getStoreFeed(): List<StoreResponse>{
        return tpsCoroutineService.getStoreFeed(DEFAULT_LATITUDE, DEFAULT_LONGITUDE )
    }
}