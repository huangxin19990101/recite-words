package com.github.huangxin19990101.recitewords.groups

import com.intellij.openapi.actionSystem.ActionGroup
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

abstract class BaseVocabularyGroup : ActionGroup() {
    abstract fun getVocabularyMap(): Map<String, String>

    override fun getChildren(e: AnActionEvent?): Array<AnAction> {
//        getVocabularyMap().forEach()

        return arrayOf()
    }
}