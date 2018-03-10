package com.android.music.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.android.music.utils.ActionBarUtils;
import com.android.music.utils.MPlayerUtils;


class StatusBarView extends View {
    public StatusBarView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public StatusBarView(Context context) {
        super(context);
    }

    public StatusBarView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        if (MPlayerUtils.canDrawBehindStatusBar()) {
            setMeasuredDimension(widthMeasureSpec, (int) ActionBarUtils.getStatusBarHeight(getContext()));
        } else {
            setMeasuredDimension(0, 0);
        }
    }
}
