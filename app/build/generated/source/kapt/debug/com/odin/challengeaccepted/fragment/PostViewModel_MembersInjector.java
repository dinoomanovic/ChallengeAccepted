package com.odin.challengeaccepted.fragment;

import com.odin.challengeaccepted.api.GetDataClient;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PostViewModel_MembersInjector implements MembersInjector<PostViewModel> {
  private final Provider<GetDataClient> postApiProvider;

  public PostViewModel_MembersInjector(Provider<GetDataClient> postApiProvider) {
    this.postApiProvider = postApiProvider;
  }

  public static MembersInjector<PostViewModel> create(Provider<GetDataClient> postApiProvider) {
    return new PostViewModel_MembersInjector(postApiProvider);
  }

  @Override
  public void injectMembers(PostViewModel instance) {
    injectPostApi(instance, postApiProvider.get());
  }

  public static void injectPostApi(PostViewModel instance, GetDataClient postApi) {
    instance.postApi = postApi;
  }
}
