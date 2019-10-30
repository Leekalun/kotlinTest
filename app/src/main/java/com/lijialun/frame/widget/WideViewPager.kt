package com.lijialun.frame.widget

import android.content.Context
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.ViewParent

class WideViewPager : ViewPager {
    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    override fun setCurrentItem(item: Int) {
        super.setCurrentItem(item)
        setCurrentItem(item, false)
    }

    override fun setCurrentItem(item: Int, smoothScroll: Boolean) {
        super.setCurrentItem(item, false)
    }

    override fun onInterceptTouchEvent(ev: MotionEvent): Boolean {
        return false
    }


    override fun onTouchEvent(ev: MotionEvent): Boolean {
        return false
    }
}