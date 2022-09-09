package com.github.huangxin19990101.recitewords.listeners

import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManagerListener
import com.github.huangxin19990101.recitewords.services.MyProjectService

internal class MyProjectManagerListener : ProjectManagerListener {

    override fun projectOpened(project: Project) {
        project.service<MyProjectService>()
        print(project.service<MyProjectService>() == project.service<MyProjectService>())
        print(System.getenv("CI"))
    }
}
