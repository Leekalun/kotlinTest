package com.lijialun.frame.model.mine

import android.view.View
import com.lijialun.frame.R
import com.lijialun.frame.base.BaseFragment

class MineFragment:BaseFragment<MinePresenter>() {
    override fun loadData() {

    }

    override fun getLayoutId(): Int {
     return R.layout.mine_fragment
    }


    override fun init(inflate: View) {

    }

    override fun initPresenter() {
        presenter=MinePresenter()
    }
}