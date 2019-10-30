package com.lijialun.frame.base

import java.io.Serializable

interface BaseView<T> : Serializable {
    abstract fun setPresenter(presenter: T)

}