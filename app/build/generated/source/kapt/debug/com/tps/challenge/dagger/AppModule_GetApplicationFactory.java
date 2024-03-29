// Generated by Dagger (https://dagger.dev).
package com.tps.challenge.dagger;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AppModule_GetApplicationFactory implements Factory<Application> {
  private final AppModule module;

  public AppModule_GetApplicationFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Application get() {
    return getApplication(module);
  }

  public static AppModule_GetApplicationFactory create(AppModule module) {
    return new AppModule_GetApplicationFactory(module);
  }

  public static Application getApplication(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.getApplication());
  }
}
