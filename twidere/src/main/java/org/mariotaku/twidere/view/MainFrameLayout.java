package org.mariotaku.twidere.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;

/**
 * Created by mariotaku on 14/10/20.
 */
public class MainFrameLayout extends TintedStatusFrameLayout {
    public MainFrameLayout(Context context) {
        super(context);
    }

    public MainFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MainFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setStatusBarHeight(int height) {
        setPadding(0, height, 0, 0);
        super.setStatusBarHeight(height);
    }

    public static interface FitSystemWindowsCallback {
        void fitSystemWindows(Rect insets);
    }
}
