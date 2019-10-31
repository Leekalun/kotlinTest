package com.lijialun.frame.widget

import android.content.Context
import android.support.design.widget.CollapsingToolbarLayout
import android.util.AttributeSet

class WidgetCollapBarLayout : CollapsingToolbarLayout {
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )
}