// Generated by Dagger (https://dagger.dev).
package com.tps.challenge.dagger;

import com.tps.challenge.TCApplication;
import com.tps.challenge.ViewModelFactory;
import com.tps.challenge.features.storefeed.StoreFeedFragment;
import com.tps.challenge.features.storefeed.StoreFeedFragment_MembersInjector;
import com.tps.challenge.network.TPSCoroutineService;
import com.tps.challenge.repository.StoreFeedRepository;
import com.tps.challenge.repository.StoreFeedRepository_Factory;
import com.tps.challenge.viewmodel.StoreFeedViewModel;
import com.tps.challenge.viewmodel.StoreFeedViewModel_Factory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DaggerAppComponent {
  private DaggerAppComponent() {
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  public static AppComponent create() {
    return new Builder().build();
  }

  private static final class Builder implements AppComponent.Builder {
    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Override
    @Deprecated
    public Builder appModule(AppModule module) {
      Preconditions.checkNotNull(module);
      return this;
    }

    @Override
    public AppComponent build() {
      return new AppComponentImpl(new NetworkModule());
    }
  }

  private static final class AppComponentImpl implements AppComponent {
    private final AppComponentImpl appComponentImpl = this;

    private Provider<TPSCoroutineService> provideCoroutineTPSServiceProvider;

    private Provider<StoreFeedRepository> storeFeedRepositoryProvider;

    private Provider<StoreFeedViewModel> storeFeedViewModelProvider;

    private AppComponentImpl(NetworkModule networkModuleParam) {

      initialize(networkModuleParam);

    }

    private ViewModelFactory<StoreFeedViewModel> viewModelFactoryOfStoreFeedViewModel() {
      return new ViewModelFactory<StoreFeedViewModel>(DoubleCheck.lazy(storeFeedViewModelProvider));
    }

    @SuppressWarnings("unchecked")
    private void initialize(final NetworkModule networkModuleParam) {
      this.provideCoroutineTPSServiceProvider = NetworkModule_ProvideCoroutineTPSServiceFactory.create(networkModuleParam);
      this.storeFeedRepositoryProvider = StoreFeedRepository_Factory.create(provideCoroutineTPSServiceProvider);
      this.storeFeedViewModelProvider = StoreFeedViewModel_Factory.create(storeFeedRepositoryProvider);
    }

    @Override
    public void inject(TCApplication app) {
    }

    @Override
    public void inject(StoreFeedFragment storeFeedFragment) {
      injectStoreFeedFragment(storeFeedFragment);
    }

    private StoreFeedFragment injectStoreFeedFragment(StoreFeedFragment instance) {
      StoreFeedFragment_MembersInjector.injectViewModelFactory(instance, viewModelFactoryOfStoreFeedViewModel());
      return instance;
    }
  }
}
