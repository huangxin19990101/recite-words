package com.github.huangxin19990101.recitewords.services

import com.github.huangxin19990101.recitewords.MyBundle

class MyApplicationService {

    init {
        println(MyBundle.message("applicationService"))

        print(System.getenv("CI"))
    }
}
