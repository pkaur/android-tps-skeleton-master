package com.tps.challenge;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\b\u00a8\u0006\t"}, d2 = {"Lcom/tps/challenge/Response;", "", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "Error", "Lcom/tps/challenge/Response$Error;", "app_debug"})
public abstract class Response {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String message = null;
    
    private Response(java.lang.String message) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMessage() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/tps/challenge/Response$Error;", "Lcom/tps/challenge/Response;", "errorMessage", "", "(Ljava/lang/String;)V", "app_debug"})
    public static final class Error extends com.tps.challenge.Response {
        
        public Error(@org.jetbrains.annotations.NotNull
        java.lang.String errorMessage) {
            super(null);
        }
    }
}