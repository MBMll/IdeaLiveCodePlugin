package com.github.mbmll.idealivecodeplugin.services

import com.intellij.openapi.project.Project
import com.github.mbmll.idealivecodeplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
