// Generated code from Butter Knife. Do not modify!
package com.github.pedrovgs.sample.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class YoutubeSampleActivity$$ViewInjector<T extends com.github.pedrovgs.sample.activity.YoutubeSampleActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296322, "field 'thumbnailImageView' and method 'onContainerClicked'");
    target.thumbnailImageView = finder.castView(view, 2131296322, "field 'thumbnailImageView'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onContainerClicked();
        }
      });
    view = finder.findRequiredView(source, 2131296313, "field 'draggablePanel'");
    target.draggablePanel = finder.castView(view, 2131296313, "field 'draggablePanel'");
  }

  @Override public void reset(T target) {
    target.thumbnailImageView = null;
    target.draggablePanel = null;
  }
}
