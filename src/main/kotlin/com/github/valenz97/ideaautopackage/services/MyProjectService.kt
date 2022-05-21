package com.github.valenz97.ideaautopackage.services

import com.intellij.openapi.project.Project
import com.github.valenz97.ideaautopackage.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
