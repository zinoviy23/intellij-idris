package com.github.zinoviy23.intellijIdris.actions

import com.github.zinoviy23.intellijIdris.services.IdrisCliService
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.application.runWriteAction
import com.intellij.openapi.module.ModuleUtil
import com.intellij.openapi.roots.ModuleRootManager
import com.intellij.openapi.roots.OrderRootType
import com.intellij.openapi.roots.libraries.LibraryTablesRegistrar

class AddIdrisStdLibraryAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val file = CommonDataKeys.PSI_FILE.getData(e.dataContext) ?: return
        val module = ModuleUtil.findModuleForFile(file) ?: return

        IdrisCliService.getInstance().getStdLibPath { stdFile ->
            val modifiableRootModel = ModuleRootManager.getInstance(module).modifiableModel
            val libraryTable = LibraryTablesRegistrar.getInstance().getLibraryTable(file.project)
            val library = libraryTable.getLibraryByName("Idris Standard Library")
                ?: runWriteAction { libraryTable.createLibrary("Idris Standard Library") }
            library.modifiableModel.let {
                it.addRoot(stdFile, OrderRootType.CLASSES)

                runWriteAction {
                    it.commit()
                }
            }
            modifiableRootModel.addLibraryEntry(library)
            runWriteAction {
                modifiableRootModel.commit()
            }
        }
    }
}