package com.example.integrador

import java.util.*
import kotlin.math.ceil

const val MINUTES_IN_MILLISECONDS: Int = 60000

open class ParkingSpace(
    private val vehicle: MutableSet<Vehicle>,

    ) {

    var countVehicle = 0
    var countFee = 0

    fun checkOutVehicle(
        //show the fee of the vehicle at checkout
        plate: String,
        onSuccess: (amount: Int) -> Unit,
        onError: () -> Unit)
    {
        val vehicleInParking = vehicle.map { it }.filter { it.plate == plate }

        if(vehicleInParking.isNotEmpty()){
            val foundVehicle = vehicleInParking[0]
            val fee = calculateFee(foundVehicle.type, foundVehicle.parkedTime, foundVehicle.discountCard != null)
            onSuccess(fee)
            countVehicle++
            countFee += fee
            vehicle.remove(foundVehicle)
        }
        else {
            onError()
        }
    }

    private fun calculateFee(
        //calculate the money to pay and if have a discount card
        vehicleType: VehicleType,
        parkedTime: Long,
        hasDiscountCard: Boolean): Int
    {
        val overtimeFraction = 15F
        val fractionatedTime: Int = ceil(parkedTime / overtimeFraction).toInt()
        val extraCost = 5
        val twoHours = 8
        val fee: Int =
            if (fractionatedTime <= twoHours) vehicleType.value
            else vehicleType.value + (extraCost * (fractionatedTime - twoHours))

        return if (hasDiscountCard) (fee * 0.85).toInt()
        else fee
    }
}

