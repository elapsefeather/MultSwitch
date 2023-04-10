package com.elapsefeather.lib;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;

public class MultTabLayout extends ConstraintLayout {
    private static final boolean IS_SCROLL = false;
    private boolean mIsScroll = false;

    MultSwitch multSwitch;

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

        multSwitch = new MultSwitch(context, attrs);
        if (mIsScroll) {
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
            horizontalScrollView.addView(multSwitch);
            horizontalScrollView.setScrollBarSize(0);// 不需要滾動條
            this.addView(horizontalScrollView);
        } else {
            this.addView(multSwitch, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        }
    }

    /*====================================== MultSwitch get/set ======================================*/
    public void setEnabled(boolean enabled) {
        if (multSwitch == null) return;
        multSwitch.setEnabled(enabled);
    }

    public boolean isEnabled() {
        if (multSwitch == null) return false;
        return multSwitch.isEnabled();
    }

    public void setViewPager(ViewPager viewPager) {
        if (viewPager == null) {
            return;
        }
        if (multSwitch == null) return;
        multSwitch.setViewPager(viewPager);
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener pageChangeListener) {
        if (multSwitch == null) return;
        multSwitch.setOnPageChangeListener(pageChangeListener);
    }

    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        if (multSwitch == null) return;
        multSwitch.onPageScrolled(position, positionOffset, positionOffsetPixels);
    }

    public void onPageSelected(int position) {
        if (multSwitch == null) return;
        multSwitch.onPageSelected(position);
    }

    public void onPageScrollStateChanged(int state) {
        if (multSwitch == null) return;
        multSwitch.onPageScrollStateChanged(state);
    }

    /*=========================================Interface=========================================*/
    public MultSwitch setOnSwitchListener(MultSwitch.OnSwitchListener onSwitchListener) {
        if (multSwitch == null) return null;
        multSwitch.setOnSwitchListener(onSwitchListener);
        return multSwitch;
    }

    /*=========================================Set and Get=========================================*/
    public int getSelectedTab() {
        if (multSwitch == null) return -1;
        return multSwitch.getSelectedTab();
    }

    public MultSwitch setSelectedTab(int mSelectedTab) {
        if (multSwitch == null) return null;
        multSwitch.setSelectedTab(mSelectedTab);
        return multSwitch;
    }

    public void clearSelection() {
        if (multSwitch == null) return;
        multSwitch.clearSelection();
    }

    public MultSwitch setBlockStyle(int blockStyle) {
        if (multSwitch == null) return null;
        multSwitch.setBlockStyle(blockStyle);
        return multSwitch;
    }

    public MultSwitch setSelectColor(int selectColor) {
        if (multSwitch == null) return null;
        multSwitch.setSelectColor(selectColor);
        return multSwitch;
    }

    public MultSwitch setUnSelectColor(int unSelectColor) {
        if (multSwitch == null) return null;
        multSwitch.setUnSelectColor(unSelectColor);
        return multSwitch;
    }

    public MultSwitch setSelectTextColor(int selectTextColor) {
        if (multSwitch == null) return null;
        multSwitch.setSelectTextColor(selectTextColor);
        return multSwitch;
    }

    public MultSwitch setUnSelectTextColor(int unSelectTextColor) {
        if (multSwitch == null) return null;
        multSwitch.setUnSelectTextColor(unSelectTextColor);
        return multSwitch;
    }

    /**
     * set data for the switchbutton
     *
     * @param tagTexts
     * @return
     */

    public MultSwitch setText(String... tagTexts) {
        if (multSwitch == null) return null;
        multSwitch.setText(tagTexts);
        return multSwitch;
    }
}
