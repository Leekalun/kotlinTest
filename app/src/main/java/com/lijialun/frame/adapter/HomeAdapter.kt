package com.lijialun.frame.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentStatePagerAdapter
import com.lijialun.frame.Constant
import com.lijialun.frame.free.FreeFragment
import com.lijialun.frame.home.HomeFrament
import com.lijialun.frame.mine.MineFragment
import com.lijialun.frame.movies.MoviesFragment
import android.support.v4.app.FragmentManager as FragmentManager1

class HomeAdapter : FragmentStatePagerAdapter {

    lateinit var fragments: HashMap<Int, Fragment>

    constructor(fm: FragmentManager1) : super(fm) {
        createFrament()
    }

    private fun createFrament() {
        fragments = HashMap()
        fragments[Constant.FRAGMENT_HOME] = HomeFrament()
        fragments[Constant.FRAGMENT_MOVIES] = MoviesFragment()
        fragments[Constant.FRAMENT_FREE] = FreeFragment()
        fragments[Constant.FRAGMENT_SETTING] = MineFragment()
    }

    override fun getItem(p0: Int): Fragment? {
        return fragments[p0]
    }

    override fun getCount(): Int {
        return fragments.size
    }
}