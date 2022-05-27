package com.example.integrador

import java.util.*
import kotlin.math.ceil

const val MINUTES_IN_MILLISECONDS: Int = 60000

data class ParkingSpace(
    val vehicle: Vehicle,
//    val checkInTime: Calendar = Calendar.getInstance(), //TODO Cheaquear si es necesario
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
            val fee = calculateFee(parking.findVehicle(plate)!!.type, parkedTime)
            onSuccess(fee)
            parking.deleteVehicle(plate)
        } else {
            onError()
            println("Sorry the vehicle isn't in the parking")

        }
    }


    private fun calculateFee(vehicleType: VehicleType, parkedTime: Long): Int {
        val overtimeFraction = 15.0
        val fractionatedTime: Int = ceil(parkedTime / overtimeFraction).toInt()
        val extraCost = 5
        return if (fractionatedTime <= 8) {
            vehicleType.value
        } else {
            vehicleType.value + (extraCost * (fractionatedTime - 8))
        }
    }
}