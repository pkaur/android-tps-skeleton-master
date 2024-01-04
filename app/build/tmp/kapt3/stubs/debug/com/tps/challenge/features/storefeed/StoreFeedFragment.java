package com.tps.challenge.features.storefeed;

import java.lang.System;

/**
 * Displays the list of Stores with its title, description and the cover image to the user.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006 "}, d2 = {"Lcom/tps/challenge/features/storefeed/StoreFeedFragment;", "Landroidx/fragment/app/Fragment;", "()V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "storeFeedAdapter", "Lcom/tps/challenge/features/storefeed/StoreFeedAdapter;", "swipeRefreshLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "viewModel", "Lcom/tps/challenge/viewmodel/StoreFeedViewModel;", "getViewModel", "()Lcom/tps/challenge/viewmodel/StoreFeedViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Lcom/tps/challenge/ViewModelFactory;", "getViewModelFactory", "()Lcom/tps/challenge/ViewModelFactory;", "setViewModelFactory", "(Lcom/tps/challenge/ViewModelFactory;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "Companion", "app_debug"})
public final class StoreFeedFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull
    public static final com.tps.challenge.features.storefeed.StoreFeedFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TAG = "StoreFeedFragment";
    private com.tps.challenge.features.storefeed.StoreFeedAdapter storeFeedAdapter;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout;
    @javax.inject.Inject
    public com.tps.challenge.ViewModelFactory<com.tps.challenge.viewmodel.StoreFeedViewModel> viewModelFactory;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public StoreFeedFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.tps.challenge.ViewModelFactory<com.tps.challenge.viewmodel.StoreFeedViewModel> getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull
    com.tps.challenge.ViewModelFactory<com.tps.challenge.viewmodel.StoreFeedViewModel> p0) {
    }
    
    private final com.tps.challenge.viewmodel.StoreFeedViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/tps/challenge/features/storefeed/StoreFeedFragment$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}