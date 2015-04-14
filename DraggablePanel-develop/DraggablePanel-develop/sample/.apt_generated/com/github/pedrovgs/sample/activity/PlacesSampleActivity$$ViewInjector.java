// Generated code from Butter Knife. Do not modify!
package com.github.pedrovgs.sample.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class PlacesSampleActivity$$ViewInjector<T extends com.github.pedrovgs.sample.activity.PlacesSampleActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296313, "field 'draggablePanel'");
    target.draggablePanel = finder.castView(view, 2131296313, "field 'draggablePanel'");
    view = finder.findRequiredView(source, 2131296311, "field 'drawerlayoutLeft'");
    target.drawerlayoutLeft = finder.castView(view, 2131296311, "field 'drawerlayoutLeft'");
    view = finder.findRequiredView(source, 2131296314, "field 'drawerImageView'");
    target.drawerImageView = finder.castView(view, 2131296314, "field 'drawerImageView'");
    view = finder.findRequiredView(source, 2131296312, "field 'placesListView'");
    target.placesListView = finder.castView(view, 2131296312, "field 'placesListView'");
  }

  @Override public void reset(T target) {
    target.draggablePanel = null;
    target.drawerlayoutLeft = null;
    target.drawerImageView = null;
    target.placesListView = null;
  }
}
