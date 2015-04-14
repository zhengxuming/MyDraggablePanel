// Generated code from Butter Knife. Do not modify!
package com.github.pedrovgs.sample.renderer;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class EpisodeRenderer$$ViewInjector<T extends com.github.pedrovgs.sample.renderer.EpisodeRenderer> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296328, "field 'episodeTitleTextView'");
    target.episodeTitleTextView = finder.castView(view, 2131296328, "field 'episodeTitleTextView'");
    view = finder.findRequiredView(source, 2131296329, "field 'episodeDateTextView'");
    target.episodeDateTextView = finder.castView(view, 2131296329, "field 'episodeDateTextView'");
    view = finder.findRequiredView(source, 2131296327, "field 'episodeNumberTextView'");
    target.episodeNumberTextView = finder.castView(view, 2131296327, "field 'episodeNumberTextView'");
  }

  @Override public void reset(T target) {
    target.episodeTitleTextView = null;
    target.episodeDateTextView = null;
    target.episodeNumberTextView = null;
  }
}
