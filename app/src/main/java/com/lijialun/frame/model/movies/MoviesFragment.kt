package com.lijialun.frame.model.movies

import android.view.View
import com.lijialun.frame.R
import com.lijialun.frame.base.BaseFragment

class MoviesFragment : BaseFragment<MoviesPresenter>() {
    override fun loadData() {

    }

    override fun getLayoutId(): Int {
        return R.layout.movies_fragment
    }

    override fun init(inflate: View) {

    }

    override fun initPresenter() {
        presenter = MoviesPresenter()
    }
}