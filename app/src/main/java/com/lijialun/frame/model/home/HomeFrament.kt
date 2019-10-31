package com.lijialun.frame.model.home

import com.lijialun.frame.R
import com.lijialun.frame.base.BaseFragment

class HomeFrament : BaseFragment<HomePresenter>() {
    override fun getLayoutId(): Int {
        return R.layout.home_fragment
    }

    override fun init() {
    }

    override fun initPresenter() {
        presenter = HomePresenter()
    }

}