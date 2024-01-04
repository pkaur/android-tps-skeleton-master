package com.tps.challenge.dagger;

import java.lang.System;

/**
 * Provides Network communication related instances.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/tps/challenge/dagger/NetworkModule;", "", "()V", "provideCoroutineTPSService", "Lcom/tps/challenge/network/TPSCoroutineService;", "provideRxTPSService", "Lcom/tps/challenge/network/TPSRxService;", "provideTPSCallService", "Lcom/tps/challenge/network/TPSCallService;", "app_debug"})
@dagger.Module
public final class NetworkModule {
    
    public NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.tps.challenge.network.TPSCallService provideTPSCallService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.tps.challenge.network.TPSCoroutineService provideCoroutineTPSService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.tps.challenge.network.TPSRxService provideRxTPSService() {
        return null;
    }
}