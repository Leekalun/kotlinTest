package com.lijialun.frame.base

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

abstract class BaseFragment<T : BasePresenter> : Fragment() {
    var activity: Context? = null
    var presenter: BasePresenter? = null
    override fun onAttach(context: Context?) {
        activity = context
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        initPresenter()
        init()
        return inflater.inflate(getLayoutId(), container,false)
    }

    abstract fun getLayoutId(): Int

    abstract fun init()

    abstract fun initPresenter()
}


