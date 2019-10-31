package com.lijialun.frame.base

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

abstract class BaseFragment<T : BasePresenter> : Fragment() {
    private var activity: Context? = null
    var presenter: BasePresenter? = null
    var prepare: Boolean = false
    override fun onAttach(context: Context?) {
        activity = context
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val inflate = inflater.inflate(getLayoutId(), container, false)
        prepare = true
        initPresenter()
        init(inflate)
        return inflate
    }


    abstract fun getLayoutId(): Int

    abstract fun init(inflate: View)

    abstract fun initPresenter()

    private fun lazyLoad() {
        if (userVisibleHint && prepare) {
            prepare = false
            loadData()
        }
    }

    override fun onResume() {
        super.onResume()
        lazyLoad()
    }

    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
        super.setUserVisibleHint(isVisibleToUser)
        lazyLoad()
    }

    abstract fun loadData()
}


