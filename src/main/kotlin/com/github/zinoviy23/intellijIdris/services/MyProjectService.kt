package com.github.zinoviy23.intellijIdris.services

import com.intellij.openapi.project.Project
import com.github.zinoviy23.intellijIdris.IdrBundle

class MyProjectService(project: Project) {

    init {
        println(IdrBundle.message("projectService", project.name))
    }
}
