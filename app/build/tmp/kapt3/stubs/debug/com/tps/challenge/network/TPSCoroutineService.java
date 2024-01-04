package com.tps.challenge.network;

import java.lang.System;

/**
 * Communicates with the TPS Challenge backend to obtain data using the coroutines.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/tps/challenge/network/TPSCoroutineService;", "", "getStoreDetails", "Lcom/tps/challenge/network/model/StoreDetailsResponse;", "storeId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStoreFeed", "", "Lcom/tps/challenge/network/model/StoreResponse;", "latitude", "", "longitude", "(DDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface TPSCoroutineService {
    
    /**
     * Returns the Store feed per location provided.
     */
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "v1/feed/")
    public abstract java.lang.Object getStoreFeed(@retrofit2.http.Query(value = "lat")
    double latitude, @retrofit2.http.Query(value = "lng")
    double longitude, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.tps.challenge.network.model.StoreResponse>> continuation);
    
    /**
     * Returns a detailed specification for the Store.
     */
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "v1/stores/{id}")
    public abstract java.lang.Object getStoreDetails(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "id")
    java.lang.String storeId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.tps.challenge.network.model.StoreDetailsResponse> continuation);
}