// Generated by Dagger (https://dagger.dev).
package com.tps.challenge.features.storefeed;

import com.tps.challenge.ViewModelFactory;
import com.tps.challenge.viewmodel.StoreFeedViewModel;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class StoreFeedFragment_MembersInjector implements MembersInjector<StoreFeedFragment> {
  private final Provider<ViewModelFactory<StoreFeedViewModel>> viewModelFactoryProvider;

  public StoreFeedFragment_MembersInjector(
      Provider<ViewModelFactory<StoreFeedViewModel>> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<StoreFeedFragment> create(
      Provider<ViewModelFactory<StoreFeedViewModel>> viewModelFactoryProvider) {
    return new StoreFeedFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(StoreFeedFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.tps.challenge.features.storefeed.StoreFeedFragment.viewModelFactory")
  public static void injectViewModelFactory(StoreFeedFragment instance,
      ViewModelFactory<StoreFeedViewModel> viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}