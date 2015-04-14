// Generated code from Butter Knife. Do not modify!
package com.github.pedrovgs.sample.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class VideoSampleActivity$$ViewInjector<T extends com.github.pedrovgs.sample.activity.VideoSampleActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296321, "field 'videoView'");
    target.videoView = finder.castView(view, 2131296321, "field 'videoView'");
    view = finder.findRequiredView(source, 2131296320, "field 'posterImageView' and method 'onPosterClicked'");
    target.posterImageView = finder.castView(view, 2131296320, "field 'posterImageView'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onPosterClicked();
        }
      });
    view = finder.findRequiredView(source, 2131296317, "field 'draggableView'");
    target.draggableView = finder.castView(view, 2131296317, "field 'draggableView'");
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
    target.videoView = null;
    target.posterImageView = null;
    target.draggableView = null;
    target.thumbnailImageView = null;
  }
}
