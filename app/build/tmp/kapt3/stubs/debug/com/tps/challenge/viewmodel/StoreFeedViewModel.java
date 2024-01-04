package com.tps.challenge.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0013"}, d2 = {"Lcom/tps/challenge/viewmodel/StoreFeedViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/tps/challenge/repository/StoreFeedRepository;", "(Lcom/tps/challenge/repository/StoreFeedRepository;)V", "TAG", "", "_stores", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/tps/challenge/network/model/StoreResponse;", "stores", "Landroidx/lifecycle/LiveData;", "getStores", "()Landroidx/lifecycle/LiveData;", "setStores", "(Landroidx/lifecycle/LiveData;)V", "fetchStoreResponse", "", "app_debug"})
public final class StoreFeedViewModel extends androidx.lifecycle.ViewModel {
    private final com.tps.challenge.repository.StoreFeedRepository repository = null;
    private final java.lang.String TAG = "StoreFeedViewModel";
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.tps.challenge.network.model.StoreResponse>> _stores = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.LiveData<java.util.List<com.tps.challenge.network.model.StoreResponse>> stores;
    
    @javax.inject.Inject
    public StoreFeedViewModel(@org.jetbrains.annotations.NotNull
    com.tps.challenge.repository.StoreFeedRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.tps.challenge.network.model.StoreResponse>> getStores() {
        return null;
    }
    
    public final void setStores(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<java.util.List<com.tps.challenge.network.model.StoreResponse>> p0) {
    }
    
    private final void fetchStoreResponse() {
    }
}