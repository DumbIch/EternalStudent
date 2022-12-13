package com.dumdumbich.study.enternalstudent.ui.events

import com.dumdumbich.study.enternalstudent.domain.DisturbanceRecorderEvent
import javafx.collections.FXCollections
import javafx.scene.Parent
import javafx.scene.layout.GridPane
import tornadofx.*

class DisturbanceRecorderEventsTableView : View() {
    override val root: Parent = GridPane()

    init {
        with(root) {
            vbox {
                label("Disturbance Recorder Events")
                tableview(FXCollections.observableArrayList(disturbanceRecorderEventsTableContent)) {
                    readonlyColumn("Code", DisturbanceRecorderEvent::code)
                    readonlyColumn("Time Stamp", DisturbanceRecorderEvent::timestamp)
                    readonlyColumn("Message", DisturbanceRecorderEvent::message)
                    resizeColumnsToFitContent()
                }
            }
        }
    }

    companion object {
        val disturbanceRecorderEventsTableContent = emptyList<DisturbanceRecorderEvent>()
        const val tableViewId = "disturbanceRecorderEventsTable"
    }

}