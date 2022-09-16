package com.github.huangxin19990101.recitewords.groups

import com.intellij.openapi.actionSystem.ActionGroup
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class JapaneseActionGroup : BaseVocabularyGroup() {
    private val jpVocabularyMap = mapOf(
        "Goin" to "顺序五十音",
        "StdJp_Mid" to "标准日本语中级词汇"
    )

    override fun getVocabularyMap(): Map<String, String> {
        return jpVocabularyMap;
    }

}