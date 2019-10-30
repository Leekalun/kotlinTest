package com.lijialun.frame.home

import android.os.Parcel
import android.os.Parcelable
import com.lijialun.frame.R
import com.lijialun.frame.base.BaseFragment
import java.io.Serializable

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