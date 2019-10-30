package com.lijialun.frame

import android.widget.CompoundButton
import android.widget.RadioGroup
import android.widget.Switch
import com.lijialun.frame.adapter.HomeAdapter
import com.lijialun.frame.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity<MainContract.Presenter>(), MainContract.View,
    RadioGroup.OnCheckedChangeListener {



    lateinit var adapter: HomeAdapter
    override fun initPresenter() {
        presenter = MainPresenter(this)
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun setPresenter(presenter: MainContract.Presenter) {
    }

    override fun init() {
        adapter = HomeAdapter(supportFragmentManager)
        pager.adapter = adapter
        pager.offscreenPageLimit = 4
        radio_group.setOnCheckedChangeListener(this)

    }
    override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
      when(checkedId){
          R.id.rb_home -> presenter?.toHome()
          R.id.rb_movies -> presenter?.toMovies()
          R.id.rb_free -> presenter?.toFree()
          R.id.rb_setting -> presenter?.toSetting()
          else -> presenter?.toHome()
      }
    }

    override fun toHome() {
        currentIndex(Constant.FRAGMENT_HOME)
    }

    override fun toMovies() {
        currentIndex(Constant.FRAGMENT_MOVIES)
    }


    override fun toFree() {
        currentIndex(Constant.FRAMENT_FREE)
    }

    override fun toSetting() {
        currentIndex(Constant.FRAGMENT_SETTING)
    }

    private fun currentIndex(index: Int) {
        pager.currentItem = index
    }
}
