package com.github.abd3lraouf.findviewbyid.services

import com.intellij.openapi.project.Project
import com.github.abd3lraouf.findviewbyid.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
