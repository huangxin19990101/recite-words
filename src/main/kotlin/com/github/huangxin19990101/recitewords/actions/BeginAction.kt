package com.github.huangxin19990101.recitewords.actions

import com.github.huangxin19990101.recitewords.MyNotifier
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata.Directory
import java.io.File

class BeginAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val logDir = File("log");
        if (!logDir.exists()) {
            logDir.mkdir();
        }

        MyNotifier.notifyError(e.project, "asdasdsa");
    }
}