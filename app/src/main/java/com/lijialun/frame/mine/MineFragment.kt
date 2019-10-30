package com.lijialun.frame.mine

import com.lijialun.frame.R
import com.lijialun.frame.base.BaseFragment

class MineFragment:BaseFragment<MinePresenter>() {
    override fun getLayoutId(): Int {
     return R.layout.mine_fragment
    }


    override fun init() {

    }

    override fun initPresenter() {
        presenter=MinePresenter()
    }
}