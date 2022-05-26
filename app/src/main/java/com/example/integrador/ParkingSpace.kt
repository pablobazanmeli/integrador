package com.example.integrador

import java.util.*

const val MINUTES_IN_MILLISECONDS: Long = 60000

data class ParkingSpace(
    var vehicle: MutableSet<Vehicle>,
    val checkInTime: Calendar = Calendar.getInstance(),
    val parkedTime: Long =
        (Calendar.getInstance().timeInMillis - checkInTime.timeInMillis) / MINUTES_IN_MILLISECONDS,
) {
    fun checkOutVehicle(plate: String, onSuccess: (amount: Int) -> Int, onError: () -> Unit) {
        val findVehicle = vehicle.filter { plate == it.plate }
        if (findVehicle.isNotEmpty()) {
            onSuccess(20)
            vehicle.remove(findVehicle[0])
            println("Your amount is ${onSuccess(20)}! See you soon")
        } else
        {
            onError()
            println("Sorry the vehicle isn't in the parking")

        }

    }
}

//if(parking.vehicles.any{ it.plate == plate })
//
//        {
//            onSuccess(parkedTime.toInt())
//        }
//        else
//        {
//            onError()
//        }

//No tomo el Get()