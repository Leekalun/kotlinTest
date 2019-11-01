package com.lijialun.frame.utils

import android.content.Context

class ScreenUtils {

    companion object{
        fun dp2px(context: Context, dpValue: Float): Int {
            val scale = context.resources.displayMetrics.density
            return (dpValue * scale + 0.5f).toInt()
        }
    }
}