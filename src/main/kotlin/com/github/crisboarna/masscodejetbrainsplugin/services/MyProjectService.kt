package com.github.crisboarna.masscodejetbrainsplugin.services

import com.intellij.openapi.project.Project
import com.github.crisboarna.masscodejetbrainsplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
