package com.lijialun.frame.base

import android.annotation.SuppressLint

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater


@SuppressLint("Registered")
abstract class BaseActivity<T : BasePresenter> : AppCompatActivity() {

    var presenter: T? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutInflater.inflate(getLayoutId(), null))
        initPresenter()
        init()
    }

    /**
     * lazy loading 懒加载
     */
    abstract fun init()

    abstract fun initPresenter()


    abstract fun getLayoutId(): Int

    override fun onResume() {
        super.onResume()
        presenter?.onResume(this)
    }

    override fun onStop() {
        super.onStop()
        presenter?.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter?.onDestroy()
    }

}