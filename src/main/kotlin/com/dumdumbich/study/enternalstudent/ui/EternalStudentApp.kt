package com.dumdumbich.study.enternalstudent.ui

import com.dumdumbich.study.enternalstudent.ui.log.DrLogfileView
import javafx.stage.Stage
import tornadofx.*

class EternalStudentApp : App() {
    override val primaryView = DrLogfileView::class
/*
    override fun start(stage: Stage) {
        super.start(stage)
        stage.isFullScreen=true
    }
*/
}