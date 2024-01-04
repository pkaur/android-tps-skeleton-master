package com.tps.challenge.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tps.challenge.network.model.StoreResponse
import com.tps.challenge.repository.StoreFeedRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

class StoreFeedViewModel @Inject constructor(private val repository: StoreFeedRepository) :
    ViewModel() {

    private val TAG = "StoreFeedViewModel"
    private val _stores = MutableLiveData<List<StoreResponse>>()
    var stores: LiveData<List<StoreResponse>> = _stores

    init {
        fetchStoreResponse()
    }

    private fun fetchStoreResponse() {
        viewModelScope.launch {
            try {
                val stores = withContext(Dispatchers.IO) { repository.getStoreFeed() }

                if (stores != null) {
                    _stores.postValue(stores)
                } else {
                    _stores.postValue(emptyList())
                }

            } catch (e: Exception) {
                Log.d(TAG, "Error fetching response : ${e.message}")
                _stores.postValue(emptyList())
            }
        }

    }

}