// Generated code from Butter Knife. Do not modify!
package com.github.pedrovgs.sample.renderer;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class TvShowRenderer$$ViewInjector<T extends com.github.pedrovgs.sample.renderer.TvShowRenderer> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296332, "field 'titleTextView'");
    target.titleTextView = finder.castView(view, 2131296332, "field 'titleTextView'");
    view = finder.findRequiredView(source, 2131296333, "field 'seasonsCounterTextView'");
    target.seasonsCounterTextView = finder.castView(view, 2131296333, "field 'seasonsCounterTextView'");
    view = finder.findRequiredView(source, 2131296322, "field 'thumbnailImageView'");
    target.thumbnailImageView = finder.castView(view, 2131296322, "field 'thumbnailImageView'");
  }

  @Override public void reset(T target) {
    target.titleTextView = null;
    target.seasonsCounterTextView = null;
    target.thumbnailImageView = null;
  }
}
