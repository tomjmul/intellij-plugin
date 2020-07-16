package com.github.tomjmul.intellijplugin.services

import com.intellij.openapi.project.Project
import com.github.tomjmul.intellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
