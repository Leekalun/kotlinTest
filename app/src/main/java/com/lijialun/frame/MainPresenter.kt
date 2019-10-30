package com.lijialun.frame

import android.content.Context
import com.lijialun.frame.base.BasePresenter

class MainPresenter(activity: MainActivity) : MainContract.Presenter {
    var model: MainModel = MainModel(this)
    var view: MainActivity = activity
    override fun toHome() {
        view.toHome()
    }

    override fun toMovies() {
        view.toMovies()
    }

    override fun toFree() {
        view.toFree()
    }

    override fun toSetting() {
        view.toSetting()
    }

    override fun onStop() {

    }

    override fun onDestroy() {
    }

    override fun onResume(context: Context) {

    }


}