package com.github.huangxin19990101.recitewords.groups

import com.github.huangxin19990101.recitewords.actions.ImportWordAction
import com.intellij.openapi.actionSystem.ActionGroup
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class DynamicActionGroup : ActionGroup() {


    override fun getChildren(e: AnActionEvent?): Array<AnAction> {
        val arrayList = ArrayList<AnAction>()
        arrayList.add(ImportWordAction())
        arrayList.add(ImportWordAction({ "Test" }, { "dynamic" }, null))
        return arrayList.toTypedArray()
    }
}