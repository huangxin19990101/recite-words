package com.github.huangxin19990101.recitewords

import com.intellij.notification.NotificationGroup
import com.intellij.notification.NotificationGroupManager
import com.intellij.notification.NotificationType
import com.intellij.openapi.project.Project

object MyNotifier {
    fun notifyError(project: Project?,
                    content: String?) {

        NotificationGroupManager.getInstance()
                .getNotificationGroup("Custom Notification Group")
                .createNotification(content!!, NotificationType.INFORMATION)
                .notify(project)
    }
}