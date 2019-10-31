package com.lijialun.frame.model.free

import android.view.View
import com.lijialun.frame.R
import com.lijialun.frame.base.BaseFragment

class FreeFragment : BaseFragment<FreePresenter>() {
    override fun loadData() {

    }

    override fun getLayoutId(): Int {
        return R.layout.free_fragment
    }

    override fun init(inflate: View) {

    }

    override fun initPresenter() {
        presenter = FreePresenter()
    }
}