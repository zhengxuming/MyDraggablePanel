// Code generated by dagger-compiler.  Do not edit.
package com.github.pedrovgs.sample.activity;


import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

/**
 * A {@code Binder<TvShowsActivity>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 *
 * Owning the dependency links between {@code TvShowsActivity} and its
 * dependencies.
 *
 * Being a {@code Provider<TvShowsActivity>} and handling creation and
 * preparation of object instances.
 *
 * Being a {@code MembersInjector<TvShowsActivity>} and handling injection
 * of annotated fields.
 */
public final class TvShowsActivity$$InjectAdapter extends Binding<TvShowsActivity>
    implements Provider<TvShowsActivity>, MembersInjector<TvShowsActivity> {
  private Binding<com.pedrogomez.renderers.RendererAdapter<com.github.pedrovgs.sample.viewmodel.TvShowViewModel>> adapter;
  private Binding<DIFragmentActivity> supertype;

  public TvShowsActivity$$InjectAdapter() {
    super("com.github.pedrovgs.sample.activity.TvShowsActivity", "members/com.github.pedrovgs.sample.activity.TvShowsActivity", NOT_SINGLETON, TvShowsActivity.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    adapter = (Binding<com.pedrogomez.renderers.RendererAdapter<com.github.pedrovgs.sample.viewmodel.TvShowViewModel>>) linker.requestBinding("com.pedrogomez.renderers.RendererAdapter<com.github.pedrovgs.sample.viewmodel.TvShowViewModel>", TvShowsActivity.class, getClass().getClassLoader());
    supertype = (Binding<DIFragmentActivity>) linker.requestBinding("members/com.github.pedrovgs.sample.activity.DIFragmentActivity", TvShowsActivity.class, getClass().getClassLoader(), false, true);
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
    injectMembersBindings.add(adapter);
    injectMembersBindings.add(supertype);
  }

  /**
   * Returns the fully provisioned instance satisfying the contract for
   * {@code Provider<TvShowsActivity>}.
   */
  @Override
  public TvShowsActivity get() {
    TvShowsActivity result = new TvShowsActivity();
    injectMembers(result);
    return result;
  }

  /**
   * Injects any {@code @Inject} annotated fields in the given instance,
   * satisfying the contract for {@code Provider<TvShowsActivity>}.
   */
  @Override
  public void injectMembers(TvShowsActivity object) {
    object.adapter = adapter.get();
    supertype.injectMembers(object);
  }
}