package com.example.integrador

import java.util.*

const val MINUTES_IN_MILLISECONDS : Long = 60000

data class ParkingSpace(
    var vehicle: Vehicle,
    val checkInTime: Calendar = Calendar.getInstance(),
    val parkedTime: Long =
        (Calendar.getInstance().timeInMillis - checkInTime.timeInMillis) / MINUTES_IN_MILLISECONDS)

//No tomo el Get()