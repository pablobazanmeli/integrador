package com.example.integrador

import java.util.*

const val MINUTES_IN_MILLISECONDS : Long = 60000

data class ParkingSpace(
    var vehicle: Vehicle,
    val checkInTime: Calendar = Calendar.getInstance(),
    val parkedTime: Long =
        (Calendar.getInstance().timeInMillis - checkInTime.timeInMillis) / MINUTES_IN_MILLISECONDS,
    val parking: Parking)
{
    fun checkOutVehicle(plate: String, onSuccess: (amount: Int) -> Unit, onError: () -> Unit)
    {
        if(parking.vehicles.any{ it.plate == plate })

        {
            onSuccess(parkedTime.toInt())
        }
        else
        {
            onError()
        }

    }
}

//No tomo el Get()