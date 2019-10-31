package com.lijialun.frame.main

import com.lijialun.frame.base.BaseModel

class MainModel : BaseModel<MainPresenter>,
    MainContract.Model {
    constructor(presenter: MainPresenter) : super(presenter)

}