package com.elapsefeather.lib;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class MultTabLayout extends ConstraintLayout {
    private static final boolean IS_SCROLL = false;
    private boolean mIsScroll = false;

    public MultTabLayout(Context context) {
        this(context, null);
    }

    public MultTabLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MultTabLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initAttrs(context, attrs);
    }

    private void initAttrs(Context context, AttributeSet attrs) {
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.MultSwitch);
        mIsScroll = typedArray.getBoolean(R.styleable.MultSwitch_isScroll, IS_SCROLL);
        typedArray.recycle();


        MultSwitch multSwitch = new MultSwitch(context, attrs);
        if (mIsScroll) {
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
            horizontalScrollView.addView(multSwitch);
            horizontalScrollView.setScrollBarSize(0);// 不需要滾動條
            this.addView(horizontalScrollView);
        } else {
            this.addView(multSwitch, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        }
    }
}
