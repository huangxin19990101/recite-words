package com.github.huangxin19990101.recitewords.groups

import com.intellij.openapi.actionSystem.ActionGroup
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class EnglishActionGroup : BaseVocabularyGroup() {

    private val engVocabularyMap = mapOf(
        "CET4_1" to "四级核心词汇",
        "CET4_3" to "四级完整词汇",
        "CET6_1" to "六级核心词汇",
        "CET6_3" to "六级完整词汇",
        "GMAT_3" to "GMAT词汇",
        "GRE_2" to "GRE词汇",
        "IELTS_3" to "IELTS词汇",
        "TOEFL_2" to "TOEFL词汇",
        "SAT_2" to "SAT词汇",
        "KaoYan_1" to "考研必考词汇",
        "KaoYan_2" to "考研完整词汇",
        "Level4_1" to "专四真题高频词",
        "Level4luan_2" to "专四核心词汇",
        "Level8_1" to "专八真题高频词",
        "Level8luan_2" to "专八核心词汇"
    )

    override fun getVocabularyMap(): Map<String, String> {
        return engVocabularyMap
    }
}