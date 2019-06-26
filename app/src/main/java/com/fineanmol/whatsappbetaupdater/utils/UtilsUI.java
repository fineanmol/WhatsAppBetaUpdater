package com.fineanmol.whatsappbetaupdater.utils;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.view.View;

import com.fineanmol.whatsappbetaupdater.R;

public class UtilsUI {

    public static void showFAB(FloatingActionButton fab, Boolean res) {
        if (res) {
            CoordinatorLayout.LayoutParams p = (CoordinatorLayout.LayoutParams) fab.getLayoutParams();
            p.setBehavior(new FloatingActionButton.Behavior());
            p.setAnchorId(R.id.app_bar);
            fab.setLayoutParams(p);
            fab.setVisibility(View.VISIBLE);
            fab.show();
        } else {
            CoordinatorLayout.LayoutParams p = (CoordinatorLayout.LayoutParams) fab.getLayoutParams();
            p.setBehavior(null);
            p.setAnchorId(View.NO_ID);
            fab.setLayoutParams(p);
            fab.setVisibility(View.GONE);
            fab.hide();
        }
    }
}
