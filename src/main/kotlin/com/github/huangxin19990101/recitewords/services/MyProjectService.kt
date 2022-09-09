package com.github.huangxin19990101.recitewords.services

import com.intellij.openapi.project.Project
import com.github.huangxin19990101.recitewords.MyBundle

class MyProjectService(project: Project) {
    init {
        println(MyBundle.message("projectService", project.name))
        print(System.getenv("CI"))
    }
}
