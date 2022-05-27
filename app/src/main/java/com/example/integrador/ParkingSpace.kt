package com.example.integrador

import java.util.*

const val MINUTES_IN_MILLISECONDS: Int = 60000

data class ParkingSpace(
    var vehicle: Vehicle,
    val parkedTime: Long =
        (Calendar.getInstance().timeInMillis - vehicle.checkInTime.timeInMillis) / MINUTES_IN_MILLISECONDS,
    val parking: Parking
) {
    fun checkOutVehicle(
        plate: String,
        onSuccess: (amount: Int) -> Unit,
        onError: () -> Unit
    ) {
        if (parking.isInParking(plate)) {
            onSuccess(20)
            parking.deleteVehicle(plate)
        } else {
            onError()
            println("Sorry the vehicle isn't in the parking")

        }
    }
}
//No tomo el Get()