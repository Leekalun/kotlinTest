package com.lijialun.frame.model.home

import android.os.Build
import android.support.annotation.RequiresApi
import android.support.design.widget.AppBarLayout
import android.util.Log
import android.view.View
import com.lijialun.frame.Constant
import com.lijialun.frame.R
import com.lijialun.frame.base.BaseFragment
import com.lijialun.frame.utils.GlideImageLoader
import kotlinx.android.synthetic.main.heard_layout.*
import kotlinx.android.synthetic.main.heard_layout.view.*
import kotlinx.android.synthetic.main.home_fragment.*
import kotlinx.android.synthetic.main.home_fragment.view.*
import kotlin.math.abs

class HomeFrament : BaseFragment<HomePresenter>() {


    private var imageList = ArrayList<String>()
    override fun getLayoutId(): Int {
        return R.layout.home_fragment
    }

    @RequiresApi(Build.VERSION_CODES.N)
    override fun init(inflate: View) {
        inflate.banner.setImageLoader(GlideImageLoader())
        inflate.appbar.addOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener { bar, offset ->

            inflate.buttom_lab.alpha =
                (1 - (inflate.banner.height - abs(offset)) / inflate.banner.height.toFloat())

        })
    }


    override fun initPresenter() {
        presenter = HomePresenter()
    }

    override fun loadData() {
        prepare = true
        imageList.clear()
        imageList.add(Constant.IMAGE_1)
        imageList.add(Constant.IMAGE_2)
        imageList.add(Constant.IMAGE_3)
        imageList.add(Constant.IMAGE_4)
        banner.setImages(imageList).start()

    }
}