package com.tps.challenge.network;

import java.lang.System;

/**
 * Communicates with the TPS Challenge backend to obtain data using the default retrofit [Call].
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J(\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000bH\'\u00a8\u0006\r"}, d2 = {"Lcom/tps/challenge/network/TPSCallService;", "", "getStoreDetails", "Lretrofit2/Call;", "Lcom/tps/challenge/network/model/StoreDetailsResponse;", "storeId", "", "getStoreFeed", "", "Lcom/tps/challenge/network/model/StoreResponse;", "latitude", "", "longitude", "app_debug"})
public abstract interface TPSCallService {
    
    /**
     * Returns the Store feed per location provided.
     */
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "v1/feed")
    public abstract retrofit2.Call<java.util.List<com.tps.challenge.network.model.StoreResponse>> getStoreFeed(@retrofit2.http.Query(value = "lat")
    double latitude, @retrofit2.http.Query(value = "lng")
    double longitude);
    
    /**
     * Returns a detailed specification for the Store.
     */
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "v1/stores/{id}")
    public abstract retrofit2.Call<com.tps.challenge.network.model.StoreDetailsResponse> getStoreDetails(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "id")
    java.lang.String storeId);
}