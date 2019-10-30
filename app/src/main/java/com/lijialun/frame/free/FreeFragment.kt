package com.lijialun.frame.free

import com.lijialun.frame.R
import com.lijialun.frame.base.BaseFragment

class FreeFragment : BaseFragment<FreePresenter>() {
    override fun getLayoutId(): Int {
        return R.layout.free_fragment
    }

    override fun init() {

    }

    override fun initPresenter() {
        presenter = FreePresenter()
    }
}