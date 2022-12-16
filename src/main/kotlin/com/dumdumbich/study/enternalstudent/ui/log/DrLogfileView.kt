package com.dumdumbich.study.enternalstudent.ui.log

import javafx.geometry.Pos
import javafx.scene.Parent
import javafx.scene.layout.Priority
import tornadofx.*

class DrLogfileView : View() {

    private val controller: DrLogfileController by inject()
//    private val logs = mutableListOf<String>() // = controller.getLogs() //mutableListOf<String>()

    override val root: Parent = borderpane {
        center {
            vbox() {
                useMaxWidth = true
                useMaxHeight = true
                alignment = Pos.CENTER
                listview<String> {
//                    setPrefSize(800.0, 600.0)
                    vgrow = Priority.ALWAYS
                    runAsync {
                        controller.getLogs()
                    } ui { logs ->
                        items.addAll(logs)
                    }
                    contextmenu {
                        item("Detail info").action {
                            println("Context menu : Detail info list item")
                        }
                        item("Edit").action {
                            println("Context menu : Edit list item")
                        }
                        separator()
                        item("Move Up").action {
                            selectedItem.apply {
                                println("Context menu : Move Up list item - $this")
                            }
                        }
                        item("Move Down").action {
                            println("Context menu : Move Down list item")
                        }
                        separator()
                        item("Cut").action {
                            println("Context menu : Cut list item")
                        }
                        item("Paste").action {
                            println("Context menu : Paste list item")
                        }
                    }
                }
            }
        }
    }

}