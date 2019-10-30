package com.lijialun.frame.base

import java.io.Serializable

open class BaseModel<T> : Serializable {
    private var presenter: T

    constructor(presenter: T) {
        this.presenter = presenter!!
    }


}