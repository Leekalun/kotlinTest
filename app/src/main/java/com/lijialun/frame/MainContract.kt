package com.lijialun.frame

import com.lijialun.frame.base.BasePresenter
import com.lijialun.frame.base.BaseView

class MainContract {
    interface View : BaseView<Presenter> {
        fun toMovies()
        fun toFree()
        fun toSetting()
        fun toHome()
    }

    interface Presenter : BasePresenter {
        //Home跳转
        fun toHome()
        //Movies跳转
        fun toMovies()

        //Free跳转
        fun toFree()

        //Setting跳转
        fun toSetting()

    }

    interface Model
}