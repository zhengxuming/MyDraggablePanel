// Generated code from Butter Knife. Do not modify!
package com.github.pedrovgs.sample.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class MoviePosterFragment$$ViewInjector<T extends com.github.pedrovgs.sample.fragment.MoviePosterFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296322, "field 'thumbnailImageView' and method 'onThubmnailClicked'");
    target.thumbnailImageView = finder.castView(view, 2131296322, "field 'thumbnailImageView'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onThubmnailClicked();
        }
      });
  }

  @Override public void reset(T target) {
    target.thumbnailImageView = null;
  }
}
