// Generated code from Butter Knife. Do not modify!
package com.github.pedrovgs.sample.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class TvShowsActivity$$ViewInjector<T extends com.github.pedrovgs.sample.activity.TvShowsActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296316, "field 'tvShowsGridView'");
    target.tvShowsGridView = finder.castView(view, 2131296316, "field 'tvShowsGridView'");
    view = finder.findRequiredView(source, 2131296318, "field 'fanArtImageView' and method 'onFanArtClicked'");
    target.fanArtImageView = finder.castView(view, 2131296318, "field 'fanArtImageView'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onFanArtClicked();
        }
      });
    view = finder.findRequiredView(source, 2131296317, "field 'draggableView'");
    target.draggableView = finder.castView(view, 2131296317, "field 'draggableView'");
    view = finder.findRequiredView(source, 2131296319, "field 'episodesListView'");
    target.episodesListView = finder.castView(view, 2131296319, "field 'episodesListView'");
  }

  @Override public void reset(T target) {
    target.tvShowsGridView = null;
    target.fanArtImageView = null;
    target.draggableView = null;
    target.episodesListView = null;
  }
}
