package com.dumdumbich.study.enternalstudent.domain

data class DisturbanceRecorderEvent(
    val code: String,
    val timestamp: String,
    val message: String
)
