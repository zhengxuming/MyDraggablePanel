// Generated code from Butter Knife. Do not modify!
package com.github.pedrovgs.sample.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class MainActivity$$ViewInjector<T extends com.github.pedrovgs.sample.activity.MainActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296309, "method 'openYoutubeSampleActivity'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.openYoutubeSampleActivity();
        }
      });
    view = finder.findRequiredView(source, 2131296307, "method 'openSimpleSampleActivity'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.openSimpleSampleActivity();
        }
      });
    view = finder.findRequiredView(source, 2131296308, "method 'openTvShowsSampleActivity'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.openTvShowsSampleActivity();
        }
      });
    view = finder.findRequiredView(source, 2131296310, "method 'openVideoSampleActivity'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.openVideoSampleActivity();
        }
      });
  }

  @Override public void reset(T target) {
  }
}
