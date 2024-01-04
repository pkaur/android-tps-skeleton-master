package com.tps.challenge.features.storefeed;

import java.lang.System;

/**
 * A RecyclerView.Adapter to populate the screen with a store feed.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u001e\u0010\u0013\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0015\u001a\u00020\bR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/tps/challenge/features/storefeed/StoreFeedAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/tps/challenge/features/storefeed/StoreItemViewHolder;", "list", "", "Lcom/tps/challenge/network/model/StoreResponse;", "(Ljava/util/List;)V", "isError", "", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "newList", "hasError", "app_debug"})
public final class StoreFeedAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.tps.challenge.features.storefeed.StoreItemViewHolder> {
    private java.util.List<com.tps.challenge.network.model.StoreResponse> list;
    private boolean isError = false;
    
    public StoreFeedAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.tps.challenge.network.model.StoreResponse> list) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.tps.challenge.features.storefeed.StoreItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.tps.challenge.features.storefeed.StoreItemViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void submitList(@org.jetbrains.annotations.NotNull
    java.util.List<com.tps.challenge.network.model.StoreResponse> newList, boolean hasError) {
    }
}