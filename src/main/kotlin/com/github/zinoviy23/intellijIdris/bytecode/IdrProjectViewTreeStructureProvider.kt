package com.github.zinoviy23.intellijIdris.bytecode

import com.intellij.ide.projectView.TreeStructureProvider
import com.intellij.ide.projectView.ViewSettings
import com.intellij.ide.projectView.impl.nodes.PsiFileNode
import com.intellij.ide.util.treeView.AbstractTreeNode

internal class IdrProjectViewTreeStructureProvider : TreeStructureProvider {
    override fun modify(
        parent: AbstractTreeNode<*>,
        children: Collection<AbstractTreeNode<*>>,
        settings: ViewSettings?
    ): Collection<AbstractTreeNode<*>> {
        return children.filter { it !is PsiFileNode || it.virtualFile?.extension != IDRIS_BYTECODE_FILE_EXT }
    }
}

internal const val IDRIS_BYTECODE_FILE_EXT = "ibc"