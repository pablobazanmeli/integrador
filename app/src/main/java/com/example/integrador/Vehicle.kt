package com.example.integrador

import java.util.*

data class Vehicle(
    val plate: String,
    val type: VehicleType,
    val checkInTime: Calendar = Calendar.getInstance(),
    val discountCard: String? = null,
    val parkedTime: Long =
        (Calendar.getInstance().timeInMillis - checkInTime.timeInMillis) / MINUTES_IN_MILLISECONDS,
) {
    override fun equals(other: Any?): Boolean {
        if (other is Vehicle) {
            return this.plate == other.plate
        }
        return super.equals(other)
    }

    override fun hashCode(): Int = this.plate.hashCode()
}
