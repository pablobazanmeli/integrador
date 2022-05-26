package com.example.integrador

data class Parking (val vehicles: MutableSet<Vehicle>, val maxVehicle: Int = 20) {

    fun addVehicle(vehicle: Vehicle) : Boolean {
        if (this.vehicles.size < maxVehicle) {
            vehicles.add(vehicle)
            println("Welcome to AlkeParking!")
            return true
        }
        println("Sorry, the check-in failed")
        return false
    }

}