package com.valloriSolutions.globalsolutions


import android.graphics.drawable.Drawable

//@Entity(tableName = "TB_SCHEDULE")
data class Scheduling(
   // @PrimaryKey(autoGenerate = true)
    var foto: Drawable?=null,
    var agendamento: String,
    var local: String,
    var data: String
)