// Generated code from Butter Knife. Do not modify!
package com.github.pedrovgs.sample.renderer;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class PlaceRenderer$$ViewInjector<T extends com.github.pedrovgs.sample.renderer.PlaceRenderer> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296331, "field 'nameTextView'");
    target.nameTextView = finder.castView(view, 2131296331, "field 'nameTextView'");
    view = finder.findRequiredView(source, 2131296330, "field 'photoImageView'");
    target.photoImageView = finder.castView(view, 2131296330, "field 'photoImageView'");
  }

  @Override public void reset(T target) {
    target.nameTextView = null;
    target.photoImageView = null;
  }
}
