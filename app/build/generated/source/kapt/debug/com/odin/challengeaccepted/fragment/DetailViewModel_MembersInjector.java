package com.odin.challengeaccepted.fragment;

import com.odin.challengeaccepted.api.GetDataClient;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DetailViewModel_MembersInjector implements MembersInjector<DetailViewModel> {
  private final Provider<GetDataClient> postApiProvider;

  public DetailViewModel_MembersInjector(Provider<GetDataClient> postApiProvider) {
    this.postApiProvider = postApiProvider;
  }

  public static MembersInjector<DetailViewModel> create(Provider<GetDataClient> postApiProvider) {
    return new DetailViewModel_MembersInjector(postApiProvider);
  }

  @Override
  public void injectMembers(DetailViewModel instance) {
    injectPostApi(instance, postApiProvider.get());
  }

  public static void injectPostApi(DetailViewModel instance, GetDataClient postApi) {
    instance.postApi = postApi;
  }
}
