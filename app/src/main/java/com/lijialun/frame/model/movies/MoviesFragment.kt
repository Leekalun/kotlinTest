package com.lijialun.frame.model.movies

import com.lijialun.frame.R
import com.lijialun.frame.base.BaseFragment

class MoviesFragment : BaseFragment<MoviesPresenter>() {
    override fun getLayoutId(): Int {
        return R.layout.movies_fragment
    }

    override fun init() {

    }

    override fun initPresenter() {
        presenter = MoviesPresenter()
    }
}