package com.dumdumbich.study.enternalstudent.ui.log

import tornadofx.*
import java.io.File
import java.io.IOException
import java.util.*

class DrLogfileController : Controller() {

    private lateinit var sc: Scanner

    init {
        try {
            sc = Scanner(File(PATH_DrLogfile), "866")
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    fun getLogs(): List<String> {
        val list = mutableListOf<String>()
        while (sc.hasNextLine()) {
            list.add(sc.nextLine())
        }
        return list
    }

//    fun getNextLog() = if (sc.hasNextLine()) sc.nextLine() else ""

    companion object {
        const val PATH_DrLogfile = "/home/dumdumbich/develop/server/data/log/d1dodrv.log"
    }

}