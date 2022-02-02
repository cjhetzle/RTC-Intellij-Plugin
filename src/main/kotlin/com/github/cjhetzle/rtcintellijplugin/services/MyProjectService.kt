package com.github.cjhetzle.rtcintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.cjhetzle.rtcintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
