package com.lijialun.frame.widget

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.RadioButton
import com.lijialun.frame.R
import java.io.Serializable
import java.util.jar.Attributes

class ButtomLab : FrameLayout {
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        initView(context)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr

    ) {
        initView(context)
    }


    private fun initView(context: Context) {
        val view = LayoutInflater.from(context).inflate(getResoureID(), this, false)
        this.addView(view)
    }

    private fun getResoureID(): Int {
        return R.layout.action_bar
    }
}