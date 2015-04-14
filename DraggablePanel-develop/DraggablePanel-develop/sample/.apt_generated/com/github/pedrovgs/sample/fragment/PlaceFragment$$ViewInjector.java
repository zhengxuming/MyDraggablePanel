// Generated code from Butter Knife. Do not modify!
package com.github.pedrovgs.sample.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class PlaceFragment$$ViewInjector<T extends com.github.pedrovgs.sample.fragment.PlaceFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296331, "field 'nameTextView'");
    target.nameTextView = finder.castView(view, 2131296331, "field 'nameTextView'");
    view = finder.findRequiredView(source, 2131296330, "field 'photoImageView' and method 'onPhotoClicked'");
    target.photoImageView = finder.castView(view, 2131296330, "field 'photoImageView'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onPhotoClicked();
        }
      });
  }

  @Override public void reset(T target) {
    target.nameTextView = null;
    target.photoImageView = null;
  }
}
