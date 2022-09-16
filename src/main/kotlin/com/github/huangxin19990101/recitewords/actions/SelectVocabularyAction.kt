package com.github.huangxin19990101.recitewords.actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class SelectVocabularyAction(val tableName: String) : AnAction(tableName, tableName, null) {
    override fun actionPerformed(e: AnActionEvent) {

    }
}