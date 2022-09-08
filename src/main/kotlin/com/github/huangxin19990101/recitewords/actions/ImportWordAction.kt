package com.github.huangxin19990101.recitewords.actions

import com.intellij.ide.BrowserUtil
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.util.NlsActions
import java.util.function.Supplier
import javax.swing.Icon

class ImportWordAction(dynamicText: Supplier<@NlsActions.ActionText String>, dynamicDescription: Supplier<@NlsActions.ActionDescription String>, icon: Icon?) : AnAction(dynamicText, dynamicDescription, icon) {
    constructor() : this({ "Import Word" }, { "Import Word" }, null)

    override fun actionPerformed(e: AnActionEvent) {
    }
}