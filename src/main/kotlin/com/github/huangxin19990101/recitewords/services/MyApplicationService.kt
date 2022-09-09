package com.github.huangxin19990101.recitewords.services

import com.github.huangxin19990101.recitewords.MyBundle

class MyApplicationService {
    init {
        println(MyBundle.message("applicationService"))

        print(System.getenv("CI"))

        //init

        //todo read 5 global field from db
//        WORD_NUMBER = int.Parse(GlobalVariable[0].currentWordNumber);
//        TABLE_NAME = GlobalVariable[0].currentBookName;
//        AUTO_PLAY = GlobalVariable[0].autoPlay;
//        ENG_TYPE = GlobalVariable[0].EngType;
//        AUTO_LOG = GlobalVariable[0].autoLog;

        // read menu

    }
}
