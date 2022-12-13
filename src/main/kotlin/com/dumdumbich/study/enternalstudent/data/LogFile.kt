package com.dumdumbich.study.enternalstudent.data

import java.io.File

class LogFile(private val path: String) {

    fun add(message: String) {
        File(path).appendText(message)
    }

    companion object {
        const val MESSAGE_AppLaunce = "Application was launched at:"
        const val MESSAGE_AppComplete = "Application is completed at:"
        const val PATH = "EternalStudent.log"
    }

}