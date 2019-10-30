package com.lijialun.frame.base

import android.content.Context
import java.io.Serializable

interface BasePresenter : Serializable {
    abstract fun onResume(context: Context)

    abstract fun onStop()

    abstract fun onDestroy()
}