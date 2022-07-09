package com.github.zinoviy23.intellijidris.services

import com.intellij.openapi.project.Project
import com.github.zinoviy23.intellijidris.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
